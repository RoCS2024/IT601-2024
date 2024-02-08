package com.amulong.encapsulation;

public class CurrencyConverter {
    private double value;
    private String currentCurrency;

    public CurrencyConverter() {

    }

    public CurrencyConverter(double value, String currentCurrency) {
        this.value = value;
        this.currentCurrency = currentCurrency;
    }

    public double convertToCurrentCurrency(double amountInPHP) {
        return amountInPHP * this.value;
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getCurrentCurrency() {
        return this.currentCurrency;
    }

    public void setCurrentCurrency(String currentCurrency) {
        this.currentCurrency = currentCurrency;
    }

}
