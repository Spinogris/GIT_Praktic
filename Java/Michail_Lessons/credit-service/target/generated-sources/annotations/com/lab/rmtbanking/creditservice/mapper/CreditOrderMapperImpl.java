package com.lab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.CreateCreditOrderDto;
import com.lab.rmtbanking.creditservice.dto.CreditOrderAfterCreateDto;
import com.lab.rmtbanking.creditservice.entity.CreditOrder;
import com.lab.rmtbanking.creditservice.entity.Product;
import com.lab.rmtbanking.creditservice.entity.enums.CreditOrderStatus;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-13T10:55:05+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
@Component
public class CreditOrderMapperImpl implements CreditOrderMapper {

    private final UuidMapper uuidMapper;

    @Autowired
    public CreditOrderMapperImpl(UuidMapper uuidMapper) {

        this.uuidMapper = uuidMapper;
    }

    @Override
    public CreditOrder dtoToCreditOrder(CreateCreditOrderDto creditOrderDto, UUID clientId) {
        if ( creditOrderDto == null && clientId == null ) {
            return null;
        }

        CreditOrder creditOrder = new CreditOrder();

        if ( creditOrderDto != null ) {
            creditOrder.setProduct( createCreditOrderDtoToProduct( creditOrderDto ) );
            creditOrder.setAmount( creditOrderDto.getAmount() );
            if ( creditOrderDto.getPeriodMonths() != null ) {
                creditOrder.setPeriodMonths( creditOrderDto.getPeriodMonths().intValue() );
            }
            creditOrder.setMonthlyIncome( creditOrderDto.getMonthlyIncome() );
            creditOrder.setMonthlyExpenditure( creditOrderDto.getMonthlyExpenditure() );
            creditOrder.setEmployerIdentificationNumber( creditOrderDto.getEmployerIdentificationNumber() );
        }
        creditOrder.setClientId( clientId );
        creditOrder.setStatus( CreditOrderStatus.IN_REVIEW );
        creditOrder.setCreationDate( LocalDate.now() );

        return creditOrder;
    }

    @Override
    public CreditOrderAfterCreateDto creditOrderToDto(CreditOrder creditOrder) {
        if ( creditOrder == null ) {
            return null;
        }

        Integer productId = null;
        String id = null;
        CreditOrderStatus status = null;
        BigDecimal amount = null;
        Integer periodMonths = null;
        LocalDate creationDate = null;

        BigInteger id1 = creditOrderProductId( creditOrder );
        if ( id1 != null ) {
            productId = id1.intValue();
        }
        id = uuidMapper.toString( creditOrder.getId() );
        status = creditOrder.getStatus();
        amount = creditOrder.getAmount();
        periodMonths = creditOrder.getPeriodMonths();
        creationDate = creditOrder.getCreationDate();

        CreditOrderAfterCreateDto creditOrderAfterCreateDto = new CreditOrderAfterCreateDto( id, productId, status, amount, periodMonths, creationDate );

        return creditOrderAfterCreateDto;
    }

    protected Product createCreditOrderDtoToProduct(CreateCreditOrderDto createCreditOrderDto) {
        if ( createCreditOrderDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( createCreditOrderDto.getProductId() );

        return product;
    }

    private BigInteger creditOrderProductId(CreditOrder creditOrder) {
        if ( creditOrder == null ) {
            return null;
        }
        Product product = creditOrder.getProduct();
        if ( product == null ) {
            return null;
        }
        BigInteger id = product.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
