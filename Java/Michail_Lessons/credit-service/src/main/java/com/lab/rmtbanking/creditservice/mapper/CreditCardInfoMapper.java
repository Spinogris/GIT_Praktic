package com.lab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.CreditCardInfoDto;
import com.lab.rmtbanking.creditservice.entity.Card;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CreditCardInfoMapper {

    @Mapping(source = "account.accountNumber", target = "accountNumber")
    @Mapping(source = "account.principalDebt", target = "principalDebt")
    @Mapping(source = "account.credit.creditOrder.product.name", target = "name")
    @Mapping(source = "account.credit.creditLimit", target = "creditLimit")
    @Mapping(source = "account.credit.currencyCode", target = "currencyCode")
    @Mapping(source = "account.credit.agreement.terminationDate", target = "terminationDate")
    CreditCardInfoDto creditCardInfoToDto(Card cardId);
}