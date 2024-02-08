package com.andersenlab.rmtbanking.creditservice.util;

import com.lab.rmtbanking.creditservice.dto.*;
import com.lab.rmtbanking.creditservice.entity.Credit;
import com.lab.rmtbanking.creditservice.entity.PaymentSchedule;
import com.lab.rmtbanking.creditservice.entity.enums.CalculationMode;
import com.lab.rmtbanking.creditservice.entity.enums.CreditOrderStatus;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class DtoCreator {

    public static PaymentsScheduleDto getPaymentsScheduleDto(Credit credit) {
        return new PaymentsScheduleDto(credit.getAccount().getAccountNumber(),
                credit.getAgreement().getId().toString(),
                credit.getAccount().getPrincipalDebt().toString(),
                credit.getAccount().getInterestDebt().toString(),
                getPayments(credit.getAccount().getPaymentSchedule()));
    }

    private static List<PaymentDto> getPayments(List<PaymentSchedule> schedules) {
        return schedules.stream()
                .map(DtoCreator::getPaymentDto)
                .collect(Collectors.toList());
    }

    public static PaymentDto getPaymentDto(PaymentSchedule schedule) {
        return new PaymentDto(schedule.getPaymentDate().toString(),
                schedule.getPrincipal().toString(),
                schedule.getInterest().toString());
    }

//    public static ProductDto getProductDto() {
//        return new ProductDto(
//                new BigInteger("1"),
//                "Credit for wedding",
//                new BigDecimal("5.3"),
//                new BigDecimal("10.1"),
//                "RUB",
//                new BigDecimal("2.3"),
//                new BigDecimal("5.6"),
//                true,
//                true,
//                true,
//                true,
//                12,
//                360,
//                true,
//                "Info for this credit",
//                CalculationMode.ANNUITY,
//                2,
//                true,
//                "CB RF",
//                new BigDecimal("1.1"),
//                new BigDecimal("2.0"));
//    }

    public static CreateCreditOrderDto getCreateCreditOrderDto() {
        return new CreateCreditOrderDto(new BigInteger("1"),
                new BigDecimal("15000.0"),
                new BigInteger("120"),
                new BigDecimal("2000"),
                new BigDecimal("500"),
                "1234567890");
    }

    public static CreditOrderAfterCreateDto getCreditOrderAfterCreateDto() {
        return new CreditOrderAfterCreateDto("1817205a-e040-0000-f000-000000000000",
                1,
                CreditOrderStatus.ACCEPTED,
                new BigDecimal("20000"),
                120,
                LocalDate.of(2022, 6, 17));
    }

    public static CreditCardDto getCreditCardDto() {
        return new CreditCardDto("923e4567-e89b-12d3-a456-426655440000",
                new BigDecimal("600000.0000"),
                new BigDecimal("1"),
                new BigDecimal("100550.55"),
                new BigDecimal("14000"),
                "2022-09-09",
                new BigDecimal("1000"),
                new BigDecimal("100"),
                "9483748374149384",
                "459200",
                "Mikhail",
                "2024-03-08",
                "VISA",
                new BigDecimal("3500000"),
                new BigDecimal("100000"));
    }

    public static CreditCardInfoDto getCreditCardInfoDto() {
        return new CreditCardInfoDto(
                "923e4567-e89b-12d3-a456-426655440000",
                "600000.0000",
                "Misha",
                "100550.55",
                "14",
                "2022-09-09",
                "Misha",
                "2024-03-08",
                "94149384",
                "459200",
                "VISA",
                "ACTIVE");
    }

    public static CreditCardInfoDto getDto() {
        return new CreditCardInfoDto(
                "459200",
                "100550.55",
                null,
                null,
                null,
                null,
                "Mikhail",
                "2024-03-08",
                "3500000",
                "100000",
                "VISA",
                "ACTIVE");
    }
}