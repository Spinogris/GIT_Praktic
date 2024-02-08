package com.andersenlab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.CreditCardInfoDto;
import com.lab.rmtbanking.creditservice.entity.Card;
import com.andersenlab.rmtbanking.creditservice.util.DtoCreator;
import com.andersenlab.rmtbanking.creditservice.util.EntityCreator;
import com.lab.rmtbanking.creditservice.mapper.CreditCardInfoMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@DisplayName("Test class for CreditCardInfoMapper")
@ExtendWith(MockitoExtension.class)
class CreditCardInfoMapperTest {

    @Spy
    private final CreditCardInfoMapper creditCardInfoMapper = new CreditCardInfoMapperImpl();

    @Test
    @DisplayName("Test mapping Cards into CardDto")
    void creditCardToCardInfoDto() {
        Card card = EntityCreator.getCard();
        CreditCardInfoDto expectDto = DtoCreator.getDto();

        Assertions.assertEquals(expectDto, creditCardInfoMapper.creditCardInfoToDto(card));
    }
}