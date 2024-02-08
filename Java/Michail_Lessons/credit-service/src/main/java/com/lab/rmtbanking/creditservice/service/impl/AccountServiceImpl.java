package com.lab.rmtbanking.creditservice.service.impl;

import com.lab.rmtbanking.creditservice.dto.AccountTestDTO;
import com.lab.rmtbanking.creditservice.entity.Account;
import com.lab.rmtbanking.creditservice.mapper.AccountTestMapper;
import com.lab.rmtbanking.creditservice.repository.AccountRepository;
import com.lab.rmtbanking.creditservice.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final AccountTestMapper accountTestMapper;

    @PersistenceContext
    private final EntityManager entityManager;

//    @Override
//    public void createTask(TaskDto taskDto, Long taskId) {
//        Task task = entityManager.find(Task.class, taskId);
//        if(task != null ) {
////            task.setStatus(newStatus);
//            entityManager.remove(task);
//        }
//    }

    @Override
    public Account getAccountById(String id) {
        return accountRepository.getById(UUID.fromString(id));
    }

    @Override
    public AccountTestDTO getAccountTestDTO(String id) {
        return accountTestMapper.toDto(accountRepository.getAccountById(UUID.fromString(id)));
    }
}