package com.lab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.CreditCardInfoDto;
import com.lab.rmtbanking.creditservice.entity.Account;
import com.lab.rmtbanking.creditservice.entity.Agreement;
import com.lab.rmtbanking.creditservice.entity.Card;
import com.lab.rmtbanking.creditservice.entity.Credit;
import com.lab.rmtbanking.creditservice.entity.CreditOrder;
import com.lab.rmtbanking.creditservice.entity.Product;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-13T10:55:05+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
@Component
public class CreditCardInfoMapperImpl implements CreditCardInfoMapper {

    @Override
    public CreditCardInfoDto creditCardInfoToDto(Card cardId) {
        if ( cardId == null ) {
            return null;
        }

        String accountNumber = null;
        String principalDebt = null;
        String name = null;
        String creditLimit = null;
        String currencyCode = null;
        String terminationDate = null;
        String holderName = null;
        String expirationDate = null;
        String balance = null;
        String transactionLimit = null;
        String paymentSystem = null;
        String status = null;

        accountNumber = cardIdAccountAccountNumber( cardId );
        BigDecimal principalDebt1 = cardIdAccountPrincipalDebt( cardId );
        if ( principalDebt1 != null ) {
            principalDebt = principalDebt1.toString();
        }
        name = cardIdAccountCreditCreditOrderProductName( cardId );
        BigDecimal creditLimit1 = cardIdAccountCreditCreditLimit( cardId );
        if ( creditLimit1 != null ) {
            creditLimit = creditLimit1.toString();
        }
        currencyCode = cardIdAccountCreditCurrencyCode( cardId );
        LocalDate terminationDate1 = cardIdAccountCreditAgreementTerminationDate( cardId );
        if ( terminationDate1 != null ) {
            terminationDate = DateTimeFormatter.ISO_LOCAL_DATE.format( terminationDate1 );
        }
        holderName = cardId.getHolderName();
        if ( cardId.getExpirationDate() != null ) {
            expirationDate = DateTimeFormatter.ISO_LOCAL_DATE.format( cardId.getExpirationDate() );
        }
        if ( cardId.getBalance() != null ) {
            balance = cardId.getBalance().toString();
        }
        if ( cardId.getTransactionLimit() != null ) {
            transactionLimit = cardId.getTransactionLimit().toString();
        }
        if ( cardId.getPaymentSystem() != null ) {
            paymentSystem = cardId.getPaymentSystem().name();
        }
        if ( cardId.getStatus() != null ) {
            status = cardId.getStatus().name();
        }

        CreditCardInfoDto creditCardInfoDto = new CreditCardInfoDto( accountNumber, principalDebt, name, creditLimit, currencyCode, terminationDate, holderName, expirationDate, balance, transactionLimit, paymentSystem, status );

        return creditCardInfoDto;
    }

    private String cardIdAccountAccountNumber(Card card) {
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

    private BigDecimal cardIdAccountPrincipalDebt(Card card) {
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

    private String cardIdAccountCreditCreditOrderProductName(Card card) {
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
        CreditOrder creditOrder = credit.getCreditOrder();
        if ( creditOrder == null ) {
            return null;
        }
        Product product = creditOrder.getProduct();
        if ( product == null ) {
            return null;
        }
        String name = product.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private BigDecimal cardIdAccountCreditCreditLimit(Card card) {
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

    private String cardIdAccountCreditCurrencyCode(Card card) {
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
        String currencyCode = credit.getCurrencyCode();
        if ( currencyCode == null ) {
            return null;
        }
        return currencyCode;
    }

    private LocalDate cardIdAccountCreditAgreementTerminationDate(Card card) {
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
        Agreement agreement = credit.getAgreement();
        if ( agreement == null ) {
            return null;
        }
        LocalDate terminationDate = agreement.getTerminationDate();
        if ( terminationDate == null ) {
            return null;
        }
        return terminationDate;
    }
}
