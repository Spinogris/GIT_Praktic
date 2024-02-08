package com.lab.rmtbanking.creditservice.controller;

import com.lab.rmtbanking.creditservice.dto.AccountTestDTO;
import com.lab.rmtbanking.creditservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class AccountTestController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/{id}")
    public AccountTestDTO getAccountTestDTOById(@PathVariable("id") String id) {
        return accountService.getAccountTestDTO(id);
    }
}