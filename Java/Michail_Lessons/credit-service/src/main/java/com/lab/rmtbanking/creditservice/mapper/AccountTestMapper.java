package com.lab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.AccountTestDTO;
import com.lab.rmtbanking.creditservice.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.Random;

@Mapper(componentModel = "spring", uses = ProductMapper.class, imports = Random.class)
public interface AccountTestMapper {

    @Mapping(source = "accountNumber", target = "accountNumber")
    @Mapping(source = "credit.type", target = "type")
    @Mapping(source = "credit.creditLimit", target = "creditLimit")
    @Mapping(source = "card.cardNumber", target = "cardNumber")
    @Mapping(source = "card.balance",
            target = "balance",
            qualifiedByName = "do",
            dateFormat = "yyyy-mm-dd",
            constant = "***",
            defaultValue = "Unknown",
            resultType = String.class)
    AccountTestDTO toDto(Account account);
}