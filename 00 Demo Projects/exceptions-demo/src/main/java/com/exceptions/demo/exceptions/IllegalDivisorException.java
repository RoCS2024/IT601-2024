package com.exceptions.demo.exceptions;

public class IllegalDivisorException extends Exception {
    public IllegalDivisorException() {
        super("Divisor must no be equal to 0");
    }
    public IllegalDivisorException(String message) {
        super(message);
    }
}
