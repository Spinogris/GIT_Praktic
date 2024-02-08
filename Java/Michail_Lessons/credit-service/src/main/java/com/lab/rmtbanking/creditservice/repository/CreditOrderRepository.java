package com.lab.rmtbanking.creditservice.repository;

import com.lab.rmtbanking.creditservice.entity.CreditOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CreditOrderRepository extends JpaRepository<CreditOrder, UUID> {
    void deleteCreditOrderByIdAndClientId(UUID creditOrderId, UUID clientId);
}