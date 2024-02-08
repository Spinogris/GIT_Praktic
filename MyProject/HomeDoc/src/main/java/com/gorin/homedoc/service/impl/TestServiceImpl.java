package com.gorin.homedoc.service.impl;

import com.gorin.homedoc.entity.Account;
import com.gorin.homedoc.repository.TestRepository;
import com.gorin.homedoc.service.interf.TestSercvice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestSercvice {

    private final TestRepository testRepository;

    @Override
    public Account getAccById(String id) {
        return testRepository.getAccountById(UUID.fromString(id));
    }
}
