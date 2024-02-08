package com.lab.rmtbanking.creditservice.service;

import com.lab.rmtbanking.creditservice.dto.CreditCardDto;
import com.lab.rmtbanking.creditservice.dto.CreditCardInfoDto;

import java.util.List;

public interface CreditCardService {

    List<CreditCardDto> getCreditCardList(String clientId);
    CreditCardInfoDto getOneCreditCardInfo(String cardId);

    //add
}