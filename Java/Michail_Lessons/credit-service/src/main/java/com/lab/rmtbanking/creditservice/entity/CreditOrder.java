package com.lab.rmtbanking.creditservice.entity;

import com.lab.rmtbanking.creditservice.entity.enums.CreditOrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "credit_orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreditOrder {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "com.andersenlab.rmtbanking.creditservice.generator.UuidTimeSequenceGenerator")
    @Column(name = "id")
    private UUID id;

    @Column(name = "number")
    private String number;

    @Column(name = "client_id")
    private UUID clientId;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "period_months")
    private Integer periodMonths;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    @Column(name = "monthly_income")
    private BigDecimal monthlyIncome;

    @Column(name = "monthly_expenditure")
    private BigDecimal monthlyExpenditure;

    @Column(name = "employer_identification_number")
    private String employerIdentificationNumber;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private CreditOrderStatus status;

    @OneToOne(mappedBy = "creditOrder", fetch = FetchType.LAZY,
            orphanRemoval = true, cascade = {MERGE, PERSIST, REFRESH})
    private Credit credit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreditOrder that = (CreditOrder) o;
        return Objects.equals(this.number, that.number)
                && Objects.equals(this.product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, product);
    }

    @Override
    public String toString() {
        return "CreditOrder{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", clientId=" + clientId +
                ", amount=" + amount +
                ", periodMonths=" + periodMonths +
                ", creationDate=" + creationDate +
                ", monthlyIncome=" + monthlyIncome +
                ", monthlyExpenditure=" + monthlyExpenditure +
                ", employerIdentificationNumber='" + employerIdentificationNumber + '\'' +
                ", status=" + status +
                ", product=" + product +
                '}';
    }
}
