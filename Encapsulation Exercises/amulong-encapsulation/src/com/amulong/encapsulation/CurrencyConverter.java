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

    public double convertToUSD() {
        if(this.currentCurrency.equals("USD")){
            return value;
        } else if(this.currentCurrency.equals("Euro")){
            return value * 0.93;
        }else if (this.currentCurrency.equals("BAHT")){
            return value * 35.56;
        }else if (this.currentCurrency.equals("JPY")){
            return value * 0.0067;
        }else if (this.currentCurrency.equals("WON")){
            return value * 0.00075;
        }
        return 0;
    }
    public double convertToEuro() {
        if (this.currentCurrency.equals("Euro")) {
            return value;
        } else if (this.currentCurrency.equals("USD")) {
            return value * 1.08;
        } else if (this.currentCurrency.equals("BAHT")) {
            return value * 0.026;
        } else if (this.currentCurrency.equals("JPY")) {
            return value * 0.007;
        } else if (this.currentCurrency.equals("WON")) {
            return value * 0.00070;
        }
        return 0;
    }

    public double convertToBaht() {
        if (this.currentCurrency.equals("BAHT")) {
            return value;
        } else if (this.currentCurrency.equals("USD")) {
            return value / 35.56;
        } else if (this.currentCurrency.equals("Euro")) {
            return value * 38.61;
        } else if (this.currentCurrency.equals("JPY")) {
            return value * 0.24;
        } else if (this.currentCurrency.equals("WON")) {
            return value * 0.027;
        }
        return 0;
    }

    public double convertToJPY() {
        if (this.currentCurrency.equals("JPY")) {
            return value;
        } else if (this.currentCurrency.equals("USD")) {
            return value / 0.0093; // Assuming 1 USD = 107.53 JPY
        } else if (this.currentCurrency.equals("Euro")) {
            return value * 160.56; // Assuming 1 Euro = 135.12 JPY
        } else if (this.currentCurrency.equals("BAHT")) {
            return value * 4.16; // Assuming 1 BAHT = 0.325 JPY
        } else if (this.currentCurrency.equals("WON")) {
            return value * 0.11;
        }
        return 0;
    }

    public double convertToWon() {
        if (this.currentCurrency.equals("WON")) {
            return value;
        } else if (this.currentCurrency.equals("USD")) {
            return value / 0.00075;
        } else if (this.currentCurrency.equals("Euro")) {
            return value * 1432.10;
        } else if (this.currentCurrency.equals("BAHT")) {
            return value * 37.10;
        } else if (this.currentCurrency.equals("JPY")) {
            return value * 8.92;
        }
        return 0;
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
