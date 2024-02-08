package com.lab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.PaymentDto;
import com.lab.rmtbanking.creditservice.dto.PaymentsScheduleDto;
import com.lab.rmtbanking.creditservice.entity.Account;
import com.lab.rmtbanking.creditservice.entity.Agreement;
import com.lab.rmtbanking.creditservice.entity.Credit;
import com.lab.rmtbanking.creditservice.entity.PaymentSchedule;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-13T10:55:05+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
@Component
public class CreditMapperImpl implements CreditMapper {

    private final PaymentScheduleMapper paymentScheduleMapper;
    private final UuidMapper uuidMapper;

    @Autowired
    public CreditMapperImpl(PaymentScheduleMapper paymentScheduleMapper, UuidMapper uuidMapper) {

        this.paymentScheduleMapper = paymentScheduleMapper;
        this.uuidMapper = uuidMapper;
    }

    @Override
    public PaymentsScheduleDto creditToPaymentScheduleDto(Credit credit) {
        if ( credit == null ) {
            return null;
        }

        String agreementId = null;
        String accountNumber = null;
        String principalDebt = null;
        String interestDebt = null;
        List<PaymentDto> payments = null;

        agreementId = uuidMapper.toString( creditAgreementId( credit ) );
        accountNumber = creditAccountAccountNumber( credit );
        BigDecimal principalDebt1 = creditAccountPrincipalDebt( credit );
        if ( principalDebt1 != null ) {
            principalDebt = principalDebt1.toString();
        }
        BigDecimal interestDebt1 = creditAccountInterestDebt( credit );
        if ( interestDebt1 != null ) {
            interestDebt = interestDebt1.toString();
        }
        List<PaymentSchedule> paymentSchedule = creditAccountPaymentSchedule( credit );
        payments = paymentScheduleListToPaymentDtoList( paymentSchedule );

        PaymentsScheduleDto paymentsScheduleDto = new PaymentsScheduleDto( accountNumber, agreementId, principalDebt, interestDebt, payments );

        return paymentsScheduleDto;
    }

    private UUID creditAgreementId(Credit credit) {
        if ( credit == null ) {
            return null;
        }
        Agreement agreement = credit.getAgreement();
        if ( agreement == null ) {
            return null;
        }
        UUID id = agreement.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String creditAccountAccountNumber(Credit credit) {
        if ( credit == null ) {
            return null;
        }
        Account account = credit.getAccount();
        if ( account == null ) {
            return null;
        }
        String accountNumber = account.getAccountNumber();
        if ( accountNumber == null ) {
            return null;
        }
        return accountNumber;
    }

    private BigDecimal creditAccountPrincipalDebt(Credit credit) {
        if ( credit == null ) {
            return null;
        }
        Account account = credit.getAccount();
        if ( account == null ) {
            return null;
        }
        BigDecimal principalDebt = account.getPrincipalDebt();
        if ( principalDebt == null ) {
            return null;
        }
        return principalDebt;
    }

    private BigDecimal creditAccountInterestDebt(Credit credit) {
        if ( credit == null ) {
            return null;
        }
        Account account = credit.getAccount();
        if ( account == null ) {
            return null;
        }
        BigDecimal interestDebt = account.getInterestDebt();
        if ( interestDebt == null ) {
            return null;
        }
        return interestDebt;
    }

    private List<PaymentSchedule> creditAccountPaymentSchedule(Credit credit) {
        if ( credit == null ) {
            return null;
        }
        Account account = credit.getAccount();
        if ( account == null ) {
            return null;
        }
        List<PaymentSchedule> paymentSchedule = account.getPaymentSchedule();
        if ( paymentSchedule == null ) {
            return null;
        }
        return paymentSchedule;
    }

    protected List<PaymentDto> paymentScheduleListToPaymentDtoList(List<PaymentSchedule> list) {
        if ( list == null ) {
            return null;
        }

        List<PaymentDto> list1 = new ArrayList<PaymentDto>( list.size() );
        for ( PaymentSchedule paymentSchedule : list ) {
            list1.add( paymentScheduleMapper.paymentToDto( paymentSchedule ) );
        }

        return list1;
    }
}
