package com.lab.rmtbanking.creditservice.entity;

import com.lab.rmtbanking.creditservice.entity.enums.CardStatus;
import com.lab.rmtbanking.creditservice.entity.enums.PaymentSystem;
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
@Table(name = "cards")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@NamedEntityGraph(name = "card-account-credit-graph",
        attributeNodes = @NamedAttributeNode(value = "account", subgraph = "account"),
        subgraphs = {
                @NamedSubgraph(name = "account", attributeNodes = {
                        @NamedAttributeNode("operation"),
                        @NamedAttributeNode("paymentSchedule"),
                        @NamedAttributeNode(value = "credit", subgraph = "credit")}),
                @NamedSubgraph(name = "credit", attributeNodes = @NamedAttributeNode("agreement"))})

@NamedEntityGraph(name = "test")
public class Card {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "com.andersenlab.rmtbanking.creditservice.generator.UuidTimeSequenceGenerator")
    @Column(name = "id")
    private UUID id;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "holder_name")
    private String holderName;

    @Column(name = "expiration_date")
    private LocalDate expirationDate;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "transaction_limit")
    private BigDecimal transactionLimit;

    @Column(name = "delivery_point")
    private String deliveryPoint;

    @Column(name = "is_digital_wallet")
    private boolean isDigitalValet;

    @Column(name = "is_virtual")
    private boolean virtual;

    @Column(name = "co_brand")
    private String coBrand;

    @Column(name = "payment_system")
    @Enumerated(EnumType.STRING)
    private PaymentSystem paymentSystem;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private CardStatus status;

    @OneToOne(cascade = {MERGE, PERSIST, REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private Account account;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Card that = (Card) o;
        return Objects.equals(this.cardNumber, that.cardNumber)
                && Objects.equals(this.account, that.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, account);
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardNumber='" + cardNumber + '\'' +
                ", holderName='" + holderName + '\'' +
                ", expirationDate=" + expirationDate +
                ", balance=" + balance +
                ", transactionLimit=" + transactionLimit +
                ", deliveryPoint='" + deliveryPoint + '\'' +
                ", isDigitalValet=" + isDigitalValet +
                ", virtual=" + virtual +
                ", coBrand='" + coBrand + '\'' +
                ", paymentSystem=" + paymentSystem +
                ", status=" + status +
                ", account=" + account +
                '}';
    }
}