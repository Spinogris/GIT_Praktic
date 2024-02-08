package com.lab.rmtbanking.creditservice.controller;

import com.lab.rmtbanking.creditservice.dto.CreateCreditOrderDto;
import com.lab.rmtbanking.creditservice.dto.CreditOrderAfterCreateDto;
import com.lab.rmtbanking.creditservice.dto.DeleteCreditOrderRequestDto;
import com.lab.rmtbanking.creditservice.service.CreditOrderService;
import com.lab.rmtbanking.creditservice.validation.annotation.Uuid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Validated
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class CreditOrderController {

    private final CreditOrderService creditOrderService;


    @PostMapping("/credit-orders/new/{clientId}")
    @ResponseStatus(HttpStatus.CREATED)
    public CreditOrderAfterCreateDto createCreditOrder(@Uuid @PathVariable("clientId") String clientId,
                                                       @Valid @RequestBody CreateCreditOrderDto createCreditOrderDto) {
        return creditOrderService.createCreditOrder(createCreditOrderDto, clientId);
    }

    @PostMapping("/credit-orders/delete/{clientId}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCreditOrder(@Uuid @PathVariable("clientId") String clientId,
                                  @Valid @RequestBody DeleteCreditOrderRequestDto deleteCreditOrderRequestDto){
        creditOrderService.deleteCreditOrder(deleteCreditOrderRequestDto, clientId);
    }
}