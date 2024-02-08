package org.example._2023_11_6.mockEx;

public interface AuditService {
    void logNewTrade(Trade trade);
}

interface TradingService {
    Long createTrade(Trade trade);
}

class Trade {
    String reference;
    String description;

    public Trade(String reference, String description) {
        this.reference = reference;
        this.description = description;
    }
}
