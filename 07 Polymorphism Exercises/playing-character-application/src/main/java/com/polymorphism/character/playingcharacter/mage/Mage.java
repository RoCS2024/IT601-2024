package com.polymorphism.character.playingcharacter.mage;

import com.polymorphism.character.playingcharacter.PlayingCharacter;

public class Mage extends PlayingCharacter {

    @Override
    public void attack() {
        System.out.println("This Mage has casts spells to the enemy");
    }

    @Override
    public void levelUp() {
        System.out.println("This Mage has levelled up to lvl 7");
    }

    @Override
    public void move() {
        System.out.println("The Mage Walked!");
    }
}
