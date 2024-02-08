package com.lab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.CreateCreditOrderDto;
import com.lab.rmtbanking.creditservice.dto.CreditOrderAfterCreateDto;
import com.lab.rmtbanking.creditservice.entity.CreditOrder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.LocalDate;
import java.util.UUID;

import static org.mapstruct.InjectionStrategy.CONSTRUCTOR;

@Mapper(componentModel = "spring", uses = {UuidMapper.class},
        injectionStrategy = CONSTRUCTOR, imports = {LocalDate.class})
public interface CreditOrderMapper {

    @Mapping(source = "creditOrderDto.productId", target = "product.id")
    @Mapping(target = "status", constant = "IN_REVIEW")
    @Mapping(target = "creationDate", expression = "java(LocalDate.now())")
    @Mapping(source = "clientId", target = "clientId")
    CreditOrder dtoToCreditOrder(CreateCreditOrderDto creditOrderDto, UUID clientId);

    @Mapping(source = "creditOrder.product.id", target = "productId")
    CreditOrderAfterCreateDto creditOrderToDto(CreditOrder creditOrder);

}