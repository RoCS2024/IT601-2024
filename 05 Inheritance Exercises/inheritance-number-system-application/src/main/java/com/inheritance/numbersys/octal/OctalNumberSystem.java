package com.inheritance.numbersys.octal;

import com.inheritance.numbersys.NumberSystem;

public class OctalNumberSystem extends NumberSystem {
    public OctalNumberSystem(int value) {
        super(value);
    }

    @Override
    public int convert(String toNumberSystem) {
        if (toNumberSystem.equals("decimal")) {
            return Integer.parseInt(String.valueOf(value));
        } else if (toNumberSystem.equals("binary")) {
            return Integer.parseInt(Integer.toBinaryString(value));
        } else {
            return super.convert(toNumberSystem);
        }
    }
}

