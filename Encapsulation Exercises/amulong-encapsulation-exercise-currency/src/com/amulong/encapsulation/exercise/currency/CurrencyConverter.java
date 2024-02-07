package com.amulong.encapsulation.exercise.currency;

public class CurrencyConverter {
    private double pesoToUsd;
    private double pesoToWon;
    private double pesoToYen;
    private double pesoToThaiBaht;
    private double pesoToEuro;

    public CurrencyConverter(){

    }
    public CurrencyConverter(double pesoToUsd, double pesoToWon, double pesoToYen, double pesoToThaiBaht, double pesoToEuro) {
        this.pesoToUsd = pesoToUsd;
        this.pesoToWon = pesoToWon;
        this.pesoToYen = pesoToYen;
        this.pesoToThaiBaht = pesoToThaiBaht;
        this.pesoToEuro = pesoToEuro;
    }

    public double convertToUSD(double amountInPeso) {
        return amountInPeso * this.pesoToUsd;
    }

    public double convertToWon(double amountInPeso) {
        return amountInPeso * this.pesoToWon;
    }

    public double convertToYen(double amountInPeso) {
        return amountInPeso * this.pesoToYen;
    }

    public double convertToThaiBaht(double amountInPeso) {
        return amountInPeso * this.pesoToThaiBaht;
    }

    public double convertToEuro(double amountInPeso) {
        return amountInPeso * this.pesoToEuro;
    }

    public double getPesoToUsd() {
        return this.pesoToUsd;
    }

    public void setPesoToUsd(double pesoToUsd) {
        this.pesoToUsd = pesoToUsd;
    }

    public double getPesoToWon() {
        return this.pesoToWon;
    }

    public void setPesoToWon(double pesoToWon) {
        this.pesoToWon = pesoToWon;
    }

    public double getPesoToYen() {
        return pesoToYen;
    }

    public void setPesoToYen(double pesoToYen) {
        this.pesoToYen = pesoToYen;
    }

    public double getPesoToThaiBaht() {
        return pesoToThaiBaht;
    }

    public void setPesoToThaiBaht(double pesoToThaiBaht) {
        this.pesoToThaiBaht = pesoToThaiBaht;
    }

    public double getPesoToEuro() {
        return pesoToEuro;
    }

    public void setPesoToEuro(double pesoToEuro) {
        this.pesoToEuro = pesoToEuro;
    }
}

