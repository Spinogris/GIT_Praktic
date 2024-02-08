package com.lab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.PaymentsScheduleDto;
import com.lab.rmtbanking.creditservice.entity.Credit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;

@Mapper(componentModel = "spring", injectionStrategy = CONSTRUCTOR,
        uses = {PaymentScheduleMapper.class, UuidMapper.class})
public interface CreditMapper {

    @Mapping(source = "credit.agreement.id", target = "agreementId")
    @Mapping(source = "credit.account.accountNumber", target = "accountNumber")
    @Mapping(source = "credit.account.principalDebt", target = "principalDebt")
    @Mapping(source = "credit.account.interestDebt", target = "interestDebt")
    @Mapping(source = "credit.account.paymentSchedule", target = "payments")
    PaymentsScheduleDto creditToPaymentScheduleDto(Credit credit);
}