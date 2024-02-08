package com.lab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.CreditCardDto;
import com.lab.rmtbanking.creditservice.entity.Card;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;

@Mapper(componentModel = "spring", injectionStrategy = CONSTRUCTOR,
        uses = {UuidMapper.class, PaymentScheduleMapper.class})
public interface CreditCardMapper {

    @Mapping(source = "id", target = "cardId")
    @Mapping(source = "account.credit.creditLimit", target = "creditLimit")
    @Mapping(source = "account.credit.interestRate", target = "interestRate")
    @Mapping(source = "account.principalDebt", target = "principalDebt")
    @Mapping(source = "account.interestDebt", target = "interestDebt")
    @Mapping(source = "account", target = "paymentDate")
    @Mapping(source = "account", qualifiedByName = "getPrincipal", target = "paymentPrincipal")
    @Mapping(source = "account", qualifiedByName = "getInterest", target = "paymentInterest")
    @Mapping(source = "account.accountNumber", target = "accountNumber")
    CreditCardDto toDto(Card card);

    List<CreditCardDto> cardsToCardsDto(List<Card> cards);
}