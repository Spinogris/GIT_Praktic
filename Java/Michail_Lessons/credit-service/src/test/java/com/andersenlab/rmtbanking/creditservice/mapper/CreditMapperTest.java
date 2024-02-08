package com.andersenlab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.PaymentsScheduleDto;
import com.lab.rmtbanking.creditservice.entity.Credit;
import com.andersenlab.rmtbanking.creditservice.util.DtoCreator;
import com.andersenlab.rmtbanking.creditservice.util.EntityCreator;
import com.lab.rmtbanking.creditservice.mapper.CreditMapper;
import com.lab.rmtbanking.creditservice.mapper.PaymentScheduleMapper;
import com.lab.rmtbanking.creditservice.mapper.UuidMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Test class for CreditMapper")
@ExtendWith(MockitoExtension.class)
public class CreditMapperTest {

    @Spy
    private UuidMapper uuidMapper = new UuidMapperImpl();
    @Spy
    private PaymentScheduleMapper paymentScheduleMapper = new PaymentScheduleMapperImpl();
    @InjectMocks
    private CreditMapper mapper = new CreditMapperImpl(paymentScheduleMapper, uuidMapper);

    @DisplayName("Test mapping Credit into PaymentScheduleDto")
    @Test
    void testCreditToPaymentScheduleDto() {
        Credit credit = EntityCreator.prepareCreditMappingPaymentScheduleDto();
        PaymentsScheduleDto expected = DtoCreator.getPaymentsScheduleDto(credit);
        PaymentsScheduleDto actual = mapper.creditToPaymentScheduleDto(credit);

        assertEquals(expected, actual);
    }
}