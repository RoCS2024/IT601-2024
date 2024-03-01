package com.exceptions.demo;

import com.exceptions.demo.exceptions.IllegalDivisorException;

public class Division {
    private double divisor;
    private double dividend;

    public double getDivisor() {
        return divisor;
    }

    public void setDivisor(double divisor) throws IllegalDivisorException {
        if(divisor == 0) {
            throw new IllegalDivisorException("Hindi nga pwedeng zero!");
        }
        this.divisor = divisor;
    }

    public double getDividend() {
        return dividend;
    }

    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    public double divide() {
        return dividend/divisor;
    }
}
