package com.inheritance.numbersys.binary;

import com.inheritance.numbersys.NumberSystem;

public class BinaryNumberSystem extends NumberSystem {
    public BinaryNumberSystem(int value) {
        super(value);
    }

    @Override
    public int convert(String toNumberSystem) {
        if (toNumberSystem.equals("decimal")) {
            return Integer.parseInt(String.valueOf(value));
        } else if (toNumberSystem.equals("octal")) {
            return Integer.parseInt(Integer.toOctalString(value));
        } else {
            return super.convert(toNumberSystem);
        }
    }
}
