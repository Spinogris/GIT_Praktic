package com.lab.rmtbanking.creditservice.repository;

import com.lab.rmtbanking.creditservice.entity.Credit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CreditRepository extends JpaRepository<Credit, UUID> {
}