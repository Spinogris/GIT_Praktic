package com.lab.rmtbanking.creditservice.dto;

import com.lab.rmtbanking.creditservice.validation.annotation.Uuid;
import lombok.Value;

@Value
public class DeleteCreditOrderRequestDto {

    @Uuid
    String id;
}
