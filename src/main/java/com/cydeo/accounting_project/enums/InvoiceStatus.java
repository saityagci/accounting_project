package com.cydeo.accounting_project.enums;

import lombok.Getter;

@Getter
public enum InvoiceStatus {

    APPROVED("Approved"),
    AWAITING_APPROVAL("Awaiting Approval");

    private String value;

    InvoiceStatus(String value) {
        this.value = value;
    }

}
