package com.lab.rmtbanking.creditservice.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.UUID;


public class Account {//POJO


    private UUID id;


    private String accountNumber;


    private BigDecimal principalDebt;


    private BigDecimal interestDebt;


    private boolean isActive;


    private LocalDate openingDate;


    private LocalDate closingDate;


    private BigDecimal outstandingPrincipal;


    private BigDecimal outstandingInterestDebt;


    private String currencyCode;


    private Credit credit;


    private List<PaymentSchedule> paymentSchedule;


    private Card card;


    private Operation operation;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account that = (Account) o;
        return Objects.equals(this.accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", principalDebt=" + principalDebt +
                ", interestDebt=" + interestDebt +
                ", active=" + isActive +
                ", openingDate=" + openingDate +
                ", closingDate=" + closingDate +
                ", outstandingPrincipal=" + outstandingPrincipal +
                ", outstandingInterestDebt=" + outstandingInterestDebt +
                ", currencyCode=" + currencyCode +
                ", credit=" + credit +
                '}';
    }
}