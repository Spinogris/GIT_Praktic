package com.lab.rmtbanking.creditservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "operations")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Operation {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "com.andersenlab.rmtbanking.creditservice.generator.UuidTimeSequenceGenerator")
    @Column(name = "id")
    private UUID id;

    @Column(name = "sum")
    private BigDecimal sum;

    @Column(name = "completed_at")
    private Timestamp completedAt;

    @Column(name = "details")
    private String details;

    @Column(name = "currency_code")
    private String currencyCode;

    @OneToOne(cascade = {MERGE, PERSIST, REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private Account account;

    @ManyToOne(cascade = {MERGE, PERSIST, REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "operation_type_id", referencedColumnName = "id")
    private OperationType operationType;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Operation that = (Operation) o;
        return Objects.equals(this.account, that.account)
                && Objects.equals(this.operationType, that.operationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, operationType);
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", sum=" + sum +
                ", completedAt=" + completedAt +
                ", details='" + details + '\'' +
                ", currencyCode=" + currencyCode +
                ", account=" + account +
                ", operationType=" + operationType +
                '}';
    }
}
