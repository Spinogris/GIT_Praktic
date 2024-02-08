package com.project.bankproj.entity.enums;

public enum AgreementStatus {
    ACTIVE(0),
    PENDING(1),
    BLOCKED(2),
    REMOVED(3);
    private final int bdRep;

    AgreementStatus(int bdRep) {
        this.bdRep = bdRep;
    }

    public int getBdRep() {
        return bdRep;
    }
}