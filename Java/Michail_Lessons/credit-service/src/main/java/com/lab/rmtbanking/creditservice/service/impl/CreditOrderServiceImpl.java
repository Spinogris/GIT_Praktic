package com.lab.rmtbanking.creditservice.service.impl;

import com.lab.rmtbanking.creditservice.dto.CreateCreditOrderDto;
import com.lab.rmtbanking.creditservice.dto.CreditOrderAfterCreateDto;
import com.lab.rmtbanking.creditservice.dto.DeleteCreditOrderRequestDto;
import com.lab.rmtbanking.creditservice.entity.CreditOrder;
import com.lab.rmtbanking.creditservice.entity.enums.CreditOrderStatus;
import com.lab.rmtbanking.creditservice.mapper.CreditOrderMapper;
import com.lab.rmtbanking.creditservice.repository.CreditOrderRepository;
import com.lab.rmtbanking.creditservice.repository.ProductRepository;
import com.lab.rmtbanking.creditservice.service.CreditOrderService;
import com.lab.rmtbanking.creditservice.exception.CreditOrderDeleteException;
import com.lab.rmtbanking.creditservice.exception.ErrorMessage;
import com.lab.rmtbanking.creditservice.exception.ProductNotFoundException;
import com.lab.rmtbanking.creditservice.service.util.ServiceUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.UUID;

//SOLID
@Service
@RequiredArgsConstructor
@Slf4j
public class CreditOrderServiceImpl implements CreditOrderService {

    private final CreditOrderRepository creditOrderRepository;
    private final ProductRepository productRepository;
    private final CreditOrderMapper mapper;
    private final ServiceUtil serviceUtil;

    @Override
    @Transactional
    public CreditOrderAfterCreateDto createCreditOrder(CreateCreditOrderDto dto, String clientId) {
        checkProductId(dto.getProductId());
        CreditOrder creditOrder = mapper.dtoToCreditOrder(dto, UUID.fromString(clientId));
        creditOrder.setNumber(serviceUtil.createNumberForCreditOrder());
        log.info("Create credit order {}", creditOrder);
        creditOrderRepository.save(creditOrder);
        return mapper.creditOrderToDto(creditOrder);
    }

    private void checkProductId(BigInteger productId) {
        log.info("Check existence of product with id {}", productId);
        productRepository.findProductById(productId).orElseThrow(
                () -> new ProductNotFoundException(ErrorMessage.CREDIT_PRODUCT_NOT_FOUND));
    }

    @Override
    @Transactional
    public void deleteCreditOrder(DeleteCreditOrderRequestDto dto, String clientId) {
        checkCreditOrder(dto); //1
        log.info("Delete credit order by client id {} and order id {}", clientId, dto.getId()); //2
        creditOrderRepository.deleteCreditOrderByIdAndClientId(UUID.fromString(dto.getId()), UUID.fromString(clientId)); // 3
    }

    private void checkCreditOrder(DeleteCreditOrderRequestDto dto)  {
        log.info("Check existence of credit order with id {}", dto.getId());
        creditOrderRepository.findById(UUID.fromString(dto.getId()))
                .filter(this::checkCreditOrderStatus)
                .orElseThrow(() -> new CreditOrderDeleteException(ErrorMessage.CREDIT_ORDER_STATUS));
    }

    private boolean checkCreditOrderStatus(CreditOrder creditOrder) {
        log.info("Check status of credit order with id {}", creditOrder.getId());
        return creditOrder.getStatus().equals(CreditOrderStatus.IN_REVIEW) ||
                creditOrder.getStatus().equals(CreditOrderStatus.ACCEPTED);
    }
}