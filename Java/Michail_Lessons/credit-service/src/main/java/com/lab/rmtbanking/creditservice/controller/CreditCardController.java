package com.lab.rmtbanking.creditservice.controller;

import com.lab.rmtbanking.creditservice.dto.CreditCardInfoDto;
import com.lab.rmtbanking.creditservice.service.CreditCardService;
import com.lab.rmtbanking.creditservice.validation.annotation.Uuid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController //@Controller SOAP
@RequestMapping("/auth/credit-cards")
@RequiredArgsConstructor
public class CreditCardController {
    private final CreditCardService creditCardService;

    @GetMapping("/info/{cardId}")
    @ResponseStatus(HttpStatus.OK)
    public CreditCardInfoDto getCreditCardInfo(@Uuid @PathVariable String cardId) {
        return creditCardService.getOneCreditCardInfo(cardId);
    }
}