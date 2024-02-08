package com.lab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.PaymentDto;
import com.lab.rmtbanking.creditservice.entity.PaymentSchedule;
import java.time.format.DateTimeFormatter;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-13T10:55:06+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
@Component
public class PaymentScheduleMapperImpl implements PaymentScheduleMapper {

    @Override
    public PaymentDto paymentToDto(PaymentSchedule schedule) {
        if ( schedule == null ) {
            return null;
        }

        String paymentPrincipal = null;
        String paymentInterest = null;
        String paymentDate = null;

        if ( schedule.getPrincipal() != null ) {
            paymentPrincipal = schedule.getPrincipal().toString();
        }
        if ( schedule.getInterest() != null ) {
            paymentInterest = schedule.getInterest().toString();
        }
        if ( schedule.getPaymentDate() != null ) {
            paymentDate = DateTimeFormatter.ISO_LOCAL_DATE.format( schedule.getPaymentDate() );
        }

        PaymentDto paymentDto = new PaymentDto( paymentDate, paymentPrincipal, paymentInterest );

        return paymentDto;
    }
}
