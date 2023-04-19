package com.cydeo.accounting_project.enums;

public enum ClientVendorType {
    CLIENT("Client"),
    VENDOR("Vendor");
    private String value;

    ClientVendorType(String value) {
        this.value = value;
    }
}
