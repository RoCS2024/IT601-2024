package com.polymorphism.text.box.alphabet;

import com.polymorphism.text.box.TextBox;
/**
 * This is the subclass which is the Alphabet.
 * */
public class Alphabet extends TextBox {
    public Alphabet(String value) {
        super(value);
    }

    @Override
    public void enable() {
        System.out.println("Alphabet TextBox is enabled");
    }
}
