package de.telran.bank.entity;

import lombok.Builder;
import lombok.Data;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;



class ManagerTest {
//  @Test
//  public void testCreateManagerToClient(){
//
//    Client client = Client.builder()
//            .address("TestAdress")
//            .phone("+4967553800")
//            .email("vlad@mail.ru")
//            .firstName("Miron")
//            . lastName("Ivanov")
//            .status(1)
//            .createIt(LocalDate.now())
//            .build();
//    Client client2 = Client.builder()
//            .address("TestAdress2")
//            .phone("+4967553801")
//            .email("vlad@mail.com")
//            .firstName("Vasilii")
//            . lastName("Petrov")
//            .status(1)
//            .createIt(LocalDate.now())
//            .build();
//
//    Manager testManager = new Manager(
//            "Mike",
//            "Vasovskiy",
//            1,
//            LocalDate.now(),
//            LocalDate.now(),
//            new ArrayList<>()
//    );
//
//    testManager.getClients().add(client);
//    testManager.getClients().add(client2);
//
//    Assertions.assertEquals(2, testManager.getClients().size());
//    Assertions.assertFalse(testManager.getId().toString().isEmpty());
//
//
//
//  }

}