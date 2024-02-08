package com.lab.rmtbanking.creditservice.service;

import com.lab.rmtbanking.creditservice.dto.AccountTestDTO;
import com.lab.rmtbanking.creditservice.entity.Account;

public interface AccountService {
    Account getAccountById(String id);

    AccountTestDTO getAccountTestDTO(String id);

//    void createTask(TaskDto taskDto, Long taskId);

}