package com.andersenlab.rmtbanking.creditservice.mapper;

import com.lab.rmtbanking.creditservice.dto.PaymentDto;
import com.lab.rmtbanking.creditservice.entity.Account;
import com.lab.rmtbanking.creditservice.entity.PaymentSchedule;
import com.lab.rmtbanking.creditservice.exception.NearestPaymentNotFoundException;
import com.lab.rmtbanking.creditservice.mapper.PaymentScheduleMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static com.andersenlab.rmtbanking.creditservice.util.EntityCreator.getAccount;
import static com.andersenlab.rmtbanking.creditservice.util.EntityCreator.getPaymentSchedule;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test class for PaymentScheduleMapper")
public class PaymentScheduleMapperTest {

    private final PaymentScheduleMapper mapper = new PaymentScheduleMapperImpl();

    @DisplayName("Test map PaymentSchedule to PaymentDto")
    @Test
    public void testPaymentToDto() {
        PaymentSchedule schedule = getPaymentSchedule(LocalDate.now());
        PaymentDto dto = mapper.paymentToDto(schedule);

        assertAll(() -> assertEquals(schedule.getPaymentDate().toString(), dto.getPaymentDate()),
                () -> assertEquals(schedule.getPrincipal().toString(), dto.getPaymentPrincipal()),
                () -> assertEquals(schedule.getInterest().toString(), dto.getPaymentInterest()));
    }

    @DisplayName("Test get nearest paymentSchedule from Account")
    @Test
    public void testGetNearestPaymentSchedule() {
        Account account = prepareForMapperTest();
        PaymentSchedule expectedPaymentSchedule = getPaymentSchedule(LocalDate.now());
        PaymentSchedule actualPaymentSchedule = mapper.getNearestPaymentSchedule(account);

        assertEquals(expectedPaymentSchedule, actualPaymentSchedule);
    }

    @DisplayName("test throws exception when there is no payment date later than today in the payment schedule")
    @Test
    public void testThrowNearestPaymentNotFoundException() {
        Account account = prepareForThrowException();

        assertThrows(NearestPaymentNotFoundException.class, () -> mapper.getNearestPaymentSchedule(account));
    }

    @DisplayName("Test get paymentDate from paymentSchedule")
    @Test
    public void testGetPaymentDate() {
        PaymentSchedule paymentSchedule = getPaymentSchedule(LocalDate.now());
        String expectedPaymentDate = String.valueOf(paymentSchedule.getPaymentDate());
        String actualPaymentDate = mapper.getPaymentDate(paymentSchedule);

        assertEquals(expectedPaymentDate, actualPaymentDate);
    }

    @DisplayName("Test get interest from account")
    @Test
    public void testGetInterest() {
        Account account = prepareForMapperTest();
        PaymentSchedule paymentSchedule = getPaymentSchedule(LocalDate.now());
        String expectedInterest = String.valueOf(paymentSchedule.getInterest());
        String actualInterest = String.valueOf(mapper.getInterest(account));

        assertEquals(expectedInterest, actualInterest);
    }

    @DisplayName("Test get principal from account")
    @Test
    public void testGetPrincipal() {
        Account account = prepareForMapperTest();
        PaymentSchedule paymentSchedule = getPaymentSchedule(LocalDate.now());
        String expectedPrincipal = String.valueOf(paymentSchedule.getPrincipal());
        String actualPrincipal = String.valueOf(mapper.getPrincipal(account));

        assertEquals(expectedPrincipal, actualPrincipal);
    }

    private static Account prepareForMapperTest() {
        Account account = getAccount();
        account.setPaymentSchedule(List.of(getPaymentSchedule(LocalDate.now()),
                getPaymentSchedule(LocalDate.of(2022, 9, 9)),
                getPaymentSchedule(LocalDate.of(2020, 1, 1))));
        return account;
    }

    private static Account prepareForThrowException() {
        Account account = getAccount();
        account.setPaymentSchedule(List.of(getPaymentSchedule(LocalDate.now().minusDays(1)),
                getPaymentSchedule(LocalDate.of(2020, 1, 1))));
        return account;
    }
}