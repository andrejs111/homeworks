package io.codelex.oop.summary.generics.Exercise2;

public enum InvoiceStatus {

    APPROVED("APPROVED"),
    SENT("SENT");

    String inText;

    InvoiceStatus(String intext) {
        this.inText = intext;
    }
}
