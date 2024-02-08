package com.lab.rmtbanking.creditservice.entity;

import com.lab.rmtbanking.creditservice.entity.enums.CreditStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "credits")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id;

    @Column(name = "type")
    private String type;

    @Column(name = "credit_limit")
    private BigDecimal creditLimit;

    @Column(name = "interest_rate")
    private BigDecimal interestRate;

    @Column(name = "personal_guarantees")
    private boolean personalGuarantees;

    @Column(name = "grace_period_months")
    private Integer gracePeriodMonths;

    @Column(name = "late_payment_rate")
    private BigDecimal latePaymentRate;

    @Column(name = "currency_code")
    private String currencyCode;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private CreditStatus status;

    @OneToOne(mappedBy = "credit",
            orphanRemoval = true, cascade = {MERGE, PERSIST, REFRESH})
    private Account account;

    @OneToOne(mappedBy = "credit",
            orphanRemoval = true, cascade = {MERGE, PERSIST, REFRESH})
    private Agreement agreement;

    @OneToOne(cascade = {MERGE, PERSIST, REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private CreditOrder creditOrder;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Credit that = (Credit) o;
        return Objects.equals(this.creditOrder, that.creditOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditOrder);
    }

    @Override
    public String toString() {
        return "Credit{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", creditLimit=" + creditLimit +
                ", interestRate=" + interestRate +
                ", personalGuarantees=" + personalGuarantees +
                ", gracePeriodMonths=" + gracePeriodMonths +
                ", status='" + status + '\'' +
                ", latePaymentRate=" + latePaymentRate +
                ", currencyCode=" + currencyCode +
                ", creditOrder=" + creditOrder +
                '}';
    }
}