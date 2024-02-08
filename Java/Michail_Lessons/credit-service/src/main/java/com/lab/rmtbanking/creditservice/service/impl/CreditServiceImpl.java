package com.lab.rmtbanking.creditservice.service.impl;

import com.lab.rmtbanking.creditservice.dto.PaymentsScheduleDto;
import com.lab.rmtbanking.creditservice.entity.Credit;
import com.lab.rmtbanking.creditservice.exception.CreditNotFoundException;
import com.lab.rmtbanking.creditservice.exception.ErrorMessage;
import com.lab.rmtbanking.creditservice.mapper.CreditMapper;
import com.lab.rmtbanking.creditservice.repository.CreditRepository;
import com.lab.rmtbanking.creditservice.service.CreditService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class CreditServiceImpl implements CreditService {

    private final CreditRepository creditRepository;
    private final CreditMapper creditMapper;

    @Override
    @Transactional(readOnly = true)
    public PaymentsScheduleDto getCreditPaymentsSchedule(String creditId) {
        log.info("Get Credit payment schedule by credit id = {}", creditId);
        Credit credit = creditRepository.findById(UUID.fromString(creditId))
                .orElseThrow(() -> new CreditNotFoundException(ErrorMessage.NO_CREDIT_WITH_ID));
        return creditMapper.creditToPaymentScheduleDto(credit);
    }
}