package com.andersenlab.rmtbanking.creditservice.service.impl;

import com.lab.rmtbanking.creditservice.dto.CreditCardDto;
import com.lab.rmtbanking.creditservice.entity.Card;
import com.lab.rmtbanking.creditservice.entity.CreditOrder;
import com.lab.rmtbanking.creditservice.entity.enums.CardStatus;
import com.lab.rmtbanking.creditservice.mapper.CreditCardMapper;
import com.lab.rmtbanking.creditservice.repository.CreditCardRepository;
import com.andersenlab.rmtbanking.creditservice.util.DtoCreator;
import com.andersenlab.rmtbanking.creditservice.util.EntityCreator;
import com.lab.rmtbanking.creditservice.service.impl.CreditCardServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.clearInvocations;
import static org.mockito.Mockito.when;

@DisplayName("Test class for CreditCardServiceImpl")
@ExtendWith(MockitoExtension.class)
class CreditCardServiceImplTest {

    @Mock
    CreditCardRepository repository;

    @Mock
    CreditCardMapper mapper;

    @InjectMocks
    CreditCardServiceImpl service;

    @AfterEach
    public void clearMocks() {
        clearInvocations(repository, mapper);
    }

    @DisplayName("Test getting credit card list")
    @Test
    void testGetCreditCardList() {
        List<Card> cards = new ArrayList<>();
        cards.add(EntityCreator.getCard());
        List<CreditCardDto> expectedList = new ArrayList<>();
        expectedList.add(DtoCreator.getCreditCardDto());
        CreditOrder creditOrder = EntityCreator.getCreditOrder();
        when(repository.getCardsByStatusAndClientId(CardStatus.ACTIVE, creditOrder.getClientId())).thenReturn(cards);
        when(mapper.cardsToCardsDto(cards)).thenReturn(expectedList);
        List<CreditCardDto> actualList = service.getCreditCardList(String.valueOf(creditOrder.getClientId()));

        assertEquals(expectedList, actualList);
    }

//    @Test
//    void getOneCreditCardInfo() {
//        Card card = EntityCreator.getCard();
//        when(repository.getCardById(card.getId())).thenReturn(card);
//        CreditCardInfoDto expected = DtoCreator.getCreditCardInfoDto();
//        when(creditCardInfoMapper.creditCardInfoToDto(card)).thenReturn(expected);
//        CreditCardInfoDto actual = service.getOneCreditCardInfo(String.valueOf(card.getId()));
//
//        assertEquals(expected, actual);
//    }
}