package com.lab.rmtbanking.creditservice.dto;

import lombok.Value;

import java.util.List;

@Value
public class PaymentsScheduleDto {

    String accountNumber;

    String agreementId;

    String principalDebt;

    String interestDebt;

    List<PaymentDto> payments;
}