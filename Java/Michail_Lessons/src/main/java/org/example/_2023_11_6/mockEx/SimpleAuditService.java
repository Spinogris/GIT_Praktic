package org.example._2023_11_6.mockEx;

public class SimpleAuditService implements AuditService{
    @Override
    public void logNewTrade(Trade trade) {
        throw new RuntimeException();
    }
}
