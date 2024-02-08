package com.lab.rmtbanking.creditservice.controller;

import com.lab.rmtbanking.creditservice.entity.Account;
import com.lab.rmtbanking.creditservice.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable("id") String id) {
        return accountService.getAccountById(id);
    }
}