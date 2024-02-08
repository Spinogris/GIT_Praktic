package com.gorin.homedoc.repository;

import com.gorin.homedoc.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TestRepository extends JpaRepository<Account, UUID> {
    Account getAccountById(UUID uuid);


}
