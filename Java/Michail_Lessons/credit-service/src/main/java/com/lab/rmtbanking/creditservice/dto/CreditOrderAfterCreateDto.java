package com.lab.rmtbanking.creditservice.dto;

import com.lab.rmtbanking.creditservice.entity.enums.CreditOrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDate;

@Value
public class CreditOrderAfterCreateDto {

    String id;

    Integer productId;

    CreditOrderStatus status;

    BigDecimal amount;

    Integer periodMonths;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    LocalDate creationDate;
}