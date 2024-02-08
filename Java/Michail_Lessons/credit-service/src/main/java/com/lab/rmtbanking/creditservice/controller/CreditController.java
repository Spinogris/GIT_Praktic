package com.lab.rmtbanking.creditservice.controller;

import com.lab.rmtbanking.creditservice.dto.PaymentsScheduleDto;
import com.lab.rmtbanking.creditservice.service.CreditService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/credits")
@RequiredArgsConstructor
public class CreditController {

    private final CreditService creditService;

    @GetMapping("/{creditId}/schedule")
    public PaymentsScheduleDto getCreditPaymentsSchedule
            (@PathVariable String creditId) {
        return creditService.getCreditPaymentsSchedule(creditId);
    }
}