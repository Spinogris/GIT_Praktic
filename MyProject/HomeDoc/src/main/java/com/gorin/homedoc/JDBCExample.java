package com.gorin.homedoc;

import java.sql.*;

public class JDBCExample {

    public static final String URl = "jdbc:mysql://localhost:3306/Adminka";
    public static final String USER = "root";
    public static final String PASSWORD = "BagsBunny7";

    private Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URl, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public void getAllUsers() {
        String sql = "SELECT id, login, pass, stat FROM Login";
        try (Connection connection = this.connect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                System.out.print(resultSet.getString("id") + ": ");
                System.out.println(resultSet.getString("login"));
                System.out.println("     " + resultSet.getString("pass"));
                System.out.println("     " + resultSet.getString("stat"));
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        JDBCExample jdbcExample = new JDBCExample();
        jdbcExample.getAllUsers();
    }
}
