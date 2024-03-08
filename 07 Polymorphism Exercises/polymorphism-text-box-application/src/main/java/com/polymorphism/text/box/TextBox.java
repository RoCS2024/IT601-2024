package com.polymorphism.text.box;
/**
 * This is the abstract class which is TextBox.
 * */
public abstract class TextBox {
    public String value;

    public TextBox(String value) {
        this.value = value;
    }

    public abstract void enable();

    public int length() {
        return value.length();
    }

}
