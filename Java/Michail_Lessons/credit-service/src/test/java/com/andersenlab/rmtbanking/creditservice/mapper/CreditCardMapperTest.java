package com.andersenlab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.CreditCardDto;
import com.lab.rmtbanking.creditservice.dto.CreditCardInfoDto;
import com.lab.rmtbanking.creditservice.entity.Card;
import com.andersenlab.rmtbanking.creditservice.util.DtoCreator;
import com.andersenlab.rmtbanking.creditservice.util.EntityCreator;
import com.lab.rmtbanking.creditservice.mapper.CreditCardInfoMapper;
import com.lab.rmtbanking.creditservice.mapper.CreditCardMapper;
import com.lab.rmtbanking.creditservice.mapper.PaymentScheduleMapper;
import com.lab.rmtbanking.creditservice.mapper.UuidMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static com.andersenlab.rmtbanking.creditservice.util.EntityCreator.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@DisplayName("Test class for CreditCardMapper")
@ExtendWith(MockitoExtension.class)
public class CreditCardMapperTest {

    @Spy
    private final CreditCardInfoMapper creditCardInfoMapper = new CreditCardInfoMapperImpl();
    @Spy
    private final UuidMapper uuidMapper = new UuidMapperImpl();
    @Spy
    private final PaymentScheduleMapper paymentScheduleMapper = new PaymentScheduleMapperImpl();
    @InjectMocks
    private final CreditCardMapper creditCardMapper = new CreditCardMapperImpl(uuidMapper, paymentScheduleMapper);

    @DisplayName("Test mapping Card into creditCardDto")
    @Test
    void testCardToCardDto() {
        Card card = prepareForMapperTest();
        CreditCardDto expectedDto = DtoCreator.getCreditCardDto();

        CreditCardDto actualDto = creditCardMapper.toDto(card);

        assertNotEquals(expectedDto, actualDto);
    }

    @DisplayName("Test mapping list Cards into list CreditCardDto")
    @Test
    void testListCardToListCardDto() {
        Card card = prepareForMapperTest();
        List<Card> cardList = List.of(card);
        CreditCardDto creditCardDto = DtoCreator.getCreditCardDto();
        List<CreditCardDto> expectedList = List.of(creditCardDto);

        List<CreditCardDto> actualList = creditCardMapper.cardsToCardsDto(cardList);

        assertNotEquals(expectedList, actualList);
    }

    @Test
    @DisplayName("Test mapping Card's info into Card's Info Dto")
    void creditCardToCardInfoDto() {
        Card card = EntityCreator.getCard();
        CreditCardInfoDto expectDto = DtoCreator.getDto();

        Assertions.assertEquals(expectDto, creditCardInfoMapper.creditCardInfoToDto(card));
    }

    public static Card prepareForMapperTest() {
        Card card = getCard();
        card.getAccount().setPaymentSchedule(Arrays.asList(
                getPaymentSchedule(LocalDate.of(2022, 9, 9)),
                getPaymentSchedule(LocalDate.of(2022, 10, 9))));
        card.getAccount().setCredit(getCredit());
        card.getAccount().getCredit().setInterestRate(new BigDecimal("1"));
        card.getAccount().getCredit().setCreditLimit(new BigDecimal("600000.0000"));
        return card;
    }
}