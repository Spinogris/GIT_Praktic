package com.lab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.CreditCardDto;
import com.lab.rmtbanking.creditservice.entity.Account;
import com.lab.rmtbanking.creditservice.entity.Card;
import com.lab.rmtbanking.creditservice.entity.Credit;
import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-13T10:55:06+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
@Component
public class CreditCardMapperImpl implements CreditCardMapper {

    private final UuidMapper uuidMapper;
    private final PaymentScheduleMapper paymentScheduleMapper;

    @Autowired
    public CreditCardMapperImpl(UuidMapper uuidMapper, PaymentScheduleMapper paymentScheduleMapper) {

        this.uuidMapper = uuidMapper;
        this.paymentScheduleMapper = paymentScheduleMapper;
    }

    @Override
    public CreditCardDto toDto(Card card) {
        if ( card == null ) {
            return null;
        }

        String cardId = null;
        BigDecimal creditLimit = null;
        BigDecimal interestRate = null;
        BigDecimal principalDebt = null;
        BigDecimal interestDebt = null;
        String paymentDate = null;
        BigDecimal paymentPrincipal = null;
        BigDecimal paymentInterest = null;
        String accountNumber = null;
        String cardNumber = null;
        String holderName = null;
        String expirationDate = null;
        String paymentSystem = null;
        BigDecimal balance = null;
        BigDecimal transactionLimit = null;

        cardId = uuidMapper.toString( card.getId() );
        creditLimit = cardAccountCreditCreditLimit( card );
        interestRate = cardAccountCreditInterestRate( card );
        principalDebt = cardAccountPrincipalDebt( card );
        interestDebt = cardAccountInterestDebt( card );
        paymentDate = paymentScheduleMapper.getPaymentDate( paymentScheduleMapper.getNearestPaymentSchedule( card.getAccount() ) );
        paymentPrincipal = paymentScheduleMapper.getPrincipal( card.getAccount() );
        paymentInterest = paymentScheduleMapper.getInterest( card.getAccount() );
        accountNumber = cardAccountAccountNumber( card );
        cardNumber = card.getCardNumber();
        holderName = card.getHolderName();
        if ( card.getExpirationDate() != null ) {
            expirationDate = DateTimeFormatter.ISO_LOCAL_DATE.format( card.getExpirationDate() );
        }
        if ( card.getPaymentSystem() != null ) {
            paymentSystem = card.getPaymentSystem().name();
        }
        balance = card.getBalance();
        transactionLimit = card.getTransactionLimit();

        CreditCardDto creditCardDto = new CreditCardDto( cardId, creditLimit, interestRate, principalDebt, interestDebt, paymentDate, paymentPrincipal, paymentInterest, cardNumber, accountNumber, holderName, expirationDate, paymentSystem, balance, transactionLimit );

        return creditCardDto;
    }

    @Override
    public List<CreditCardDto> cardsToCardsDto(List<Card> cards) {
        if ( cards == null ) {
            return null;
        }

        List<CreditCardDto> list = new ArrayList<CreditCardDto>( cards.size() );
        for ( Card card : cards ) {
            list.add( toDto( card ) );
        }

        return list;
    }

    private BigDecimal cardAccountCreditCreditLimit(Card card) {
        if ( card == null ) {
            return null;
        }
        Account account = card.getAccount();
        if ( account == null ) {
            return null;
        }
        Credit credit = account.getCredit();
        if ( credit == null ) {
            return null;
        }
        BigDecimal creditLimit = credit.getCreditLimit();
        if ( creditLimit == null ) {
            return null;
        }
        return creditLimit;
    }

    private BigDecimal cardAccountCreditInterestRate(Card card) {
        if ( card == null ) {
            return null;
        }
        Account account = card.getAccount();
        if ( account == null ) {
            return null;
        }
        Credit credit = account.getCredit();
        if ( credit == null ) {
            return null;
        }
        BigDecimal interestRate = credit.getInterestRate();
        if ( interestRate == null ) {
            return null;
        }
        return interestRate;
    }

    private BigDecimal cardAccountPrincipalDebt(Card card) {
        if ( card == null ) {
            return null;
        }
        Account account = card.getAccount();
        if ( account == null ) {
            return null;
        }
        BigDecimal principalDebt = account.getPrincipalDebt();
        if ( principalDebt == null ) {
            return null;
        }
        return principalDebt;
    }

    private BigDecimal cardAccountInterestDebt(Card card) {
        if ( card == null ) {
            return null;
        }
        Account account = card.getAccount();
        if ( account == null ) {
            return null;
        }
        BigDecimal interestDebt = account.getInterestDebt();
        if ( interestDebt == null ) {
            return null;
        }
        return interestDebt;
    }

    private String cardAccountAccountNumber(Card card) {
        if ( card == null ) {
            return null;
        }
        Account account = card.getAccount();
        if ( account == null ) {
            return null;
        }
        String accountNumber = account.getAccountNumber();
        if ( accountNumber == null ) {
            return null;
        }
        return accountNumber;
    }
}
