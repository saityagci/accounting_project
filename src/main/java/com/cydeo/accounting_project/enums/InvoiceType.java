package com.cydeo.accounting_project.enums;

public enum InvoiceType {

    PURCHASE("Purchase Invoice"),
    SALES("Sales Invoice");

    private String value;

    InvoiceType(String value) {
        this.value = value;
    }

}
