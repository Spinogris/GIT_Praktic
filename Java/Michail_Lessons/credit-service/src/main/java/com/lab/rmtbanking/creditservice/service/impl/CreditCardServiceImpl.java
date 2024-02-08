package com.lab.rmtbanking.creditservice.service.impl;

import com.lab.rmtbanking.creditservice.dto.CreditCardDto;
import com.lab.rmtbanking.creditservice.dto.CreditCardInfoDto;
import com.lab.rmtbanking.creditservice.entity.enums.CardStatus;
import com.lab.rmtbanking.creditservice.exception.CreditOrderDeleteException;
import com.lab.rmtbanking.creditservice.exception.NearestPaymentNotFoundException;
import com.lab.rmtbanking.creditservice.exception.ProductNotFoundException;
import com.lab.rmtbanking.creditservice.mapper.CreditCardInfoMapper;
import com.lab.rmtbanking.creditservice.mapper.CreditCardMapper;
import com.lab.rmtbanking.creditservice.repository.CreditCardRepository;
import com.lab.rmtbanking.creditservice.service.CreditCardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class CreditCardServiceImpl implements CreditCardService {

    private final CreditCardRepository creditCardRepository; // = new CreditCardRepository();
    private final CreditCardMapper cardMapper; //
    private final CreditCardInfoMapper creditCardInfoMapper;

    @Override
    @Transactional
    public List<CreditCardDto> getCreditCardList(String clientId) {
        return cardMapper.cardsToCardsDto(creditCardRepository
                .getCardsByStatusAndClientId(CardStatus.ACTIVE, UUID.fromString(clientId)));
    }

    @Override
    @Transactional(
            timeout = 60,
            readOnly = true,
            isolation = Isolation.READ_UNCOMMITTED,
            rollbackFor = {CreditOrderDeleteException.class, NearestPaymentNotFoundException.class},
            noRollbackFor = ProductNotFoundException.class,
            propagation = Propagation.MANDATORY,
            rollbackForClassName = "CreditOrderDeleteException.class",
            noRollbackForClassName = "CreditOrderDeleteException.class"
    )
    public CreditCardInfoDto getOneCreditCardInfo(String cardId) {
        log.info("Get information about credit card with id {}", cardId);
        return creditCardInfoMapper.creditCardInfoToDto(creditCardRepository.getById(UUID.fromString(cardId)));
    }





}