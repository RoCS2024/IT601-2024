package com.amulong.encapsulation;

public class CurrencyConverter {
    private double currentCurrency;

    public CurrencyConverter(){

    }
    public CurrencyConverter(double currentCurrency) {
        this.currentCurrency = currentCurrency;
    }

    public double convertToCurrentCurrency(double amountInPHP) {
        return amountInPHP * this.currentCurrency;
    }

    public double getCurrentCurrency() {
        return this.currentCurrency;
    }

    public void setCurrentCurrency(double currentCurrency) {
        this.currentCurrency = currentCurrency;
    }
}
