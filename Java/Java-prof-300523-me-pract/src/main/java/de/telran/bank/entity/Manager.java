package de.telran.bank.entity;

import lombok.Builder;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Manager {
    private UUID id = UUID.randomUUID();
    private String firstName;
    private String lastName;
    private int status;
    private LocalDate createIt;
    private LocalDate updateIt;
    private List<Client> clients;

    public Manager() {
    }

    public Manager(String firstName, String lastName, int status, LocalDate createIt, LocalDate updateIt, List<Client> clients) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.createIt = createIt;
        this.updateIt = updateIt;
        this.clients = clients;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStatus() {
        return status;
    }

    public LocalDate getCreateIt() {
        return createIt;
    }

    public LocalDate getUpdateIt() {
        return updateIt;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setCreateIt(LocalDate createIt) {
        this.createIt = createIt;
    }

    public void setUpdateIt(LocalDate updateIt) {
        this.updateIt = updateIt;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", status=" + status +
                ", createIt=" + createIt +
                ", updateIt=" + updateIt +
                ", clients=" + clients +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return status == manager.status && Objects.equals(id, manager.id) && Objects.equals(firstName, manager.firstName)
                && Objects.equals(lastName, manager.lastName) && Objects.equals(createIt, manager.createIt) &&
                Objects.equals(updateIt, manager.updateIt) && Objects.equals(clients, manager.clients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, status, createIt, updateIt, clients);
    }
}
