package com.tuszynski.currency_exchange_service;

public enum CurrencyCode {
    USD("USD"),
    PLN("PLN"),
    EUR("EUR"),
    GBP("GBP"),
    CZK("CZK"),
    RUB("RUB");

    private String name;

    CurrencyCode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
