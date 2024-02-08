package com.lab.rmtbanking.creditservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "operation_types")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OperationType {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "com.andersenlab.rmtbanking.creditservice.generator.UuidTimeSequenceGenerator")
    @Column(name = "id")
    private UUID id;


    @Column(name = "type")
    private String type;

    @Column(name = "is_debit")
    private boolean debit;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OperationType that = (OperationType) o;
        return Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "OperationType{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", debit=" + debit +
                '}';
    }
}
