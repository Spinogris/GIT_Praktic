package com.lab.rmtbanking.creditservice.repository;

import com.lab.rmtbanking.creditservice.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {

    @Query("")
    Account getAccountById(UUID id);


//    List<Account> findByIdAndAccountNumber(UUID id);

}