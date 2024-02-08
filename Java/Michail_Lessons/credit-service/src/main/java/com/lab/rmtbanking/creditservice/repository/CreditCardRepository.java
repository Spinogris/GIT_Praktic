package com.lab.rmtbanking.creditservice.repository;

import com.lab.rmtbanking.creditservice.entity.Card;
import com.lab.rmtbanking.creditservice.entity.enums.CardStatus;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface CreditCardRepository extends JpaRepository<Card, UUID> {

    @EntityGraph(value = "card-account-credit-graph")
    @Query("from Card c where c.status =:status and c.account.credit.creditOrder.clientId =:clientId")
    List<Card> getCardsByStatusAndClientId(CardStatus status, UUID clientId);
}