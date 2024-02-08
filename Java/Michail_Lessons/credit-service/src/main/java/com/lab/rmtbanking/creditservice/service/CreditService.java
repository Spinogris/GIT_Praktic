package com.lab.rmtbanking.creditservice.service;

import com.lab.rmtbanking.creditservice.dto.PaymentsScheduleDto;

public interface CreditService {

    PaymentsScheduleDto getCreditPaymentsSchedule(String creditId);

//    List<CreditDto> getAllCedits();
}
