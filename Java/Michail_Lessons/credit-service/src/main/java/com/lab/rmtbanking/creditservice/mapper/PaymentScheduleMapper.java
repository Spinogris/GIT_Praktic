package com.lab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.PaymentDto;
import com.lab.rmtbanking.creditservice.entity.Account;
import com.lab.rmtbanking.creditservice.entity.PaymentSchedule;
import com.lab.rmtbanking.creditservice.exception.ErrorMessage;
import com.lab.rmtbanking.creditservice.exception.NearestPaymentNotFoundException;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;

@Mapper(componentModel = "spring")
public interface PaymentScheduleMapper {

    @Mapping(source = "principal", target = "paymentPrincipal")
    @Mapping(source = "interest", target = "paymentInterest")
    PaymentDto paymentToDto(PaymentSchedule schedule);
    default PaymentSchedule getNearestPaymentSchedule(Account account) {
        return account.getPaymentSchedule().stream()
                .filter(t -> t.getPaymentDate().isAfter(LocalDate.now().minusDays(1)))
                .min(Comparator.comparing(PaymentSchedule::getPaymentDate))
                .orElseThrow(() -> new NearestPaymentNotFoundException(ErrorMessage.NEAREST_PAYMENT_NOT_FOUND));
    }

    default String getPaymentDate(PaymentSchedule paymentSchedule) {
        return String.valueOf(paymentSchedule.getPaymentDate());
    }

    @Named("getPrincipal")
    default BigDecimal getPrincipal(Account account) {
        return getNearestPaymentSchedule(account).getPrincipal();
    }

    @Named("getInterest")
    default BigDecimal getInterest(Account account) {
        return getNearestPaymentSchedule(account).getInterest();
    }
}