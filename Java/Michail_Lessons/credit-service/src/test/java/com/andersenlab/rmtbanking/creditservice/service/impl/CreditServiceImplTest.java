package com.andersenlab.rmtbanking.creditservice.service.impl;

import com.lab.rmtbanking.creditservice.dto.PaymentsScheduleDto;
import com.lab.rmtbanking.creditservice.entity.Credit;
import com.lab.rmtbanking.creditservice.mapper.CreditMapper;
import com.lab.rmtbanking.creditservice.repository.CreditRepository;
import com.lab.rmtbanking.creditservice.exception.CreditNotFoundException;
import com.andersenlab.rmtbanking.creditservice.util.DtoCreator;
import com.andersenlab.rmtbanking.creditservice.util.EntityCreator;
import com.lab.rmtbanking.creditservice.service.impl.CreditServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@DisplayName("Test class for CreditServiceImpl")
@ExtendWith(MockitoExtension.class)
class CreditServiceImplTest {

    @Mock
    private CreditRepository creditRepository;
    @Mock
    private CreditMapper creditMapper;
    @InjectMocks
    private CreditServiceImpl creditService;

    @DisplayName("Test creating a credit payments schedule")
    @Test
    void testGetCreditPaymentsSchedule() {
        Credit credit = EntityCreator.prepareCreditMappingPaymentScheduleDto();
        PaymentsScheduleDto scheduleDto = DtoCreator.getPaymentsScheduleDto(credit);
        when(creditRepository.findById(credit.getId()))
                .thenReturn(Optional.of(credit));
        when(creditMapper.creditToPaymentScheduleDto(credit))
                .thenReturn(scheduleDto);

        PaymentsScheduleDto actualScheduleDto = creditService.getCreditPaymentsSchedule(credit.getId().toString());

        assertEquals(scheduleDto, actualScheduleDto);
    }

    @DisplayName("Test throwing exception then no credit")
    @Test
    void testThrowExceptionNoCreditWithId() {
        assertThrows(CreditNotFoundException.class,
                () -> creditService.getCreditPaymentsSchedule("323e4999-0000-1111-a456-426655440000"));
    }
}