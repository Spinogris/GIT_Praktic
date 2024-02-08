package com.lab.rmtbanking.creditservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Value;

@Value
public class PaymentDto {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    String paymentDate;

    String paymentPrincipal;
    String paymentInterest;
}
