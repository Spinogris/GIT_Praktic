package com.andersenlab.rmtbanking.creditservice.service.impl;

import com.lab.rmtbanking.creditservice.dto.CreateCreditOrderDto;
import com.lab.rmtbanking.creditservice.dto.CreditOrderAfterCreateDto;
import com.lab.rmtbanking.creditservice.dto.DeleteCreditOrderRequestDto;
import com.lab.rmtbanking.creditservice.entity.CreditOrder;
import com.lab.rmtbanking.creditservice.entity.Product;
import com.lab.rmtbanking.creditservice.entity.enums.CreditOrderStatus;
import com.lab.rmtbanking.creditservice.mapper.CreditOrderMapper;
import com.lab.rmtbanking.creditservice.repository.CreditOrderRepository;
import com.lab.rmtbanking.creditservice.repository.ProductRepository;
import com.lab.rmtbanking.creditservice.exception.CreditOrderDeleteException;
import com.lab.rmtbanking.creditservice.exception.ProductNotFoundException;
import com.lab.rmtbanking.creditservice.service.impl.CreditOrderServiceImpl;
import com.lab.rmtbanking.creditservice.service.util.ServiceUtil;
import com.andersenlab.rmtbanking.creditservice.util.DtoCreator;
import com.andersenlab.rmtbanking.creditservice.util.EntityCreator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@DisplayName("Test class for CreditOrderServiceImpl")
@ExtendWith(MockitoExtension.class)
class CreditOrderServiceImplTest {
    @Mock
    private CreditOrderRepository creditOrderRepository;

    @Mock
    private ProductRepository productRepository;

    @Mock
    private CreditOrderMapper mapper;

    @Mock
    private ServiceUtil serviceUtil;

    @InjectMocks
    private CreditOrderServiceImpl service;

    @AfterEach
    public void clearMocks() {
        clearInvocations(creditOrderRepository, productRepository, mapper, serviceUtil);
    }

    @DisplayName("Test creating credit order")
    @Test
    void testCreateCreditOrder() {
        CreateCreditOrderDto dto = DtoCreator.getCreateCreditOrderDto();
        CreditOrderAfterCreateDto afterCreateDto = DtoCreator.getCreditOrderAfterCreateDto();
        CreditOrder creditOrder = EntityCreator.getCreditOrder();
        Product product = EntityCreator.getProduct();
        when(creditOrderRepository.save(creditOrder)).thenReturn(creditOrder);
        when(productRepository.findProductById(product.getId())).thenReturn(Optional.of(product));
        when(mapper.dtoToCreditOrder(dto, creditOrder.getClientId())).thenReturn(creditOrder);
        when(mapper.creditOrderToDto(creditOrder)).thenReturn(afterCreateDto);
        when(serviceUtil.createNumberForCreditOrder()).thenReturn(dto.getEmployerIdentificationNumber());

        CreditOrderAfterCreateDto actualDto = service.createCreditOrder(dto, creditOrder.getClientId().toString());
        assertEquals(actualDto, afterCreateDto);
    }

    @DisplayName("Test throws an exception if a credit product with this product ID does not exist")
    @Test
    void testThrowProductNotFoundException() {
        CreateCreditOrderDto dto = DtoCreator.getCreateCreditOrderDto();
        CreditOrder creditOrder = EntityCreator.getCreditOrder();

        assertThrows(ProductNotFoundException.class, () -> service.createCreditOrder(dto, creditOrder.getClientId().toString()));
    }

    @DisplayName("Test throws an exception with credit order status IN_REVIEW or ACCEPTED")
    @Test
    void testThrowCreditOrderDeleteException() {
        CreditOrder creditOrder = EntityCreator.getCreditOrder();
        DeleteCreditOrderRequestDto dto = new DeleteCreditOrderRequestDto(String.valueOf(creditOrder.getId()));

        assertThrows(CreditOrderDeleteException.class,
                () -> service.deleteCreditOrder(dto, String.valueOf(creditOrder.getClientId())));
        verify(creditOrderRepository).findById(creditOrder.getId());
    }

    @DisplayName("Test delete credit order")
    @Test
    void testDeleteCreditOrder() {
        CreditOrder creditOrder = EntityCreator.getCreditOrder();
        creditOrder.setStatus(CreditOrderStatus.IN_REVIEW);
        DeleteCreditOrderRequestDto dto = new DeleteCreditOrderRequestDto(String.valueOf(creditOrder.getId()));
        when(creditOrderRepository.findById(UUID.fromString(dto.getId()))).thenReturn(Optional.of(creditOrder));
        service.deleteCreditOrder(dto, String.valueOf(creditOrder.getClientId()));

        verify(creditOrderRepository).findById(UUID.fromString(dto.getId()));
    }
}