package com.lab.rmtbanking.creditservice.entity;

import com.lab.rmtbanking.creditservice.entity.enums.CalculationMode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    @Id
    @Column(name = "id")
    private BigInteger id;

    @Column(name = "name")
    private String name;

    @Column(name = "min_sum")
    private BigDecimal minSum;

    @Column(name = "max_sum")
    private BigDecimal maxSum;

    @Column(name = "min_interest_rate")
    private BigDecimal minInterestRate;

    @Column(name = "max_interest_rate")
    private BigDecimal maxInterestRate;

    @Column(name = "need_guarantees")
    private boolean needGuarantees;

    @Column(name = "delivery_in_cash")
    private boolean deliveryInCash;

    @Column(name = "early_repayment")
    private boolean earlyRepayment;

    @Column(name = "need_income_details")
    private boolean needIncomeDetails;

    @Column(name = "min_period_months")
    private Integer minPeriodMonths;

    @Column(name = "max_period_months")
    private Integer maxPeriodMonths;

    @Column(name = "is_active")
    private boolean active;

    @Column(name = "details")
    private String details;

    @Column(name =
             "grace_period_months")
    private Integer gracePeriodMonths;

    @Column(name = "rate_is_adjustable")
    private boolean rateIsAdjustable;

    @Column(name = "rate_base")
    private String rateBase;

    @Column(name = "rate_fix_part")
    private BigDecimal rateFixPart;

    @Column(name = "increased_rate")
    private BigDecimal increasedRate;

    @Column(name = "currency_code")
    private String currencyCode;

    @Column(name = "calculation_mode")
    @Enumerated(EnumType.STRING)
    private CalculationMode calculationMode;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product that = (Product) o;
        return Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", minSum=" + minSum +
                ", maxSum=" + maxSum +
                ", minInterestRate=" + minInterestRate +
                ", maxInterestRate=" + maxInterestRate +
                ", needGuarantees=" + needGuarantees +
                ", deliveryInCash=" + deliveryInCash +
                ", earlyRepayment=" + earlyRepayment +
                ", needIncomeDetails=" + needIncomeDetails +
                ", minPeriodMonths=" + minPeriodMonths +
                ", maxPeriodMonths=" + maxPeriodMonths +
                ", active=" + active +
                ", details='" + details + '\'' +
                ", calculationMode='" + calculationMode + '\'' +
                ", gracePeriodMonths=" + gracePeriodMonths +
                ", rateIsAdjustable=" + rateIsAdjustable +
                ", rateBase='" + rateBase + '\'' +
                ", rateFixPart=" + rateFixPart +
                ", increasedRate=" + increasedRate +
                ", currencyCode='" + currencyCode + '\'' +
                '}';
    }
}
