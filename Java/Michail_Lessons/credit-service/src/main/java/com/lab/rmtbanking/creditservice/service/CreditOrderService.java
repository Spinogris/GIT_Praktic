package com.lab.rmtbanking.creditservice.service;

import com.lab.rmtbanking.creditservice.dto.CreateCreditOrderDto;
import com.lab.rmtbanking.creditservice.dto.CreditOrderAfterCreateDto;
import com.lab.rmtbanking.creditservice.dto.DeleteCreditOrderRequestDto;

public interface CreditOrderService {

    CreditOrderAfterCreateDto createCreditOrder(CreateCreditOrderDto createCreditOrderDto, String clientId);

    void deleteCreditOrder(DeleteCreditOrderRequestDto dto, String clientId);
}