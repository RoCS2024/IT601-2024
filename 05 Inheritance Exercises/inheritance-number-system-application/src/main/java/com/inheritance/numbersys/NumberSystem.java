/**
 * The NumberSystem class represents a number in various number systems and provides
 * functionality to convert the number between different systems.
 */
package com.inheritance.numbersys;

/** This is the value of the number in decimal system. */
public class NumberSystem {
    protected int value;

    public NumberSystem(int value) {
        this.value = value;
    }

    public int convert(String toNumberSystem) {
        if (toNumberSystem.equals("binary")) {
            return Integer.parseInt(Integer.toBinaryString(value));
        } else if (toNumberSystem.equals("octal")) {
            return Integer.parseInt(Integer.toOctalString(value));
        } else {
            return value; // Default is decimal
        }
    }
}
