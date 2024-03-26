package com.polymorphism.character.playingcharacter.warrior;

import com.polymorphism.character.playingcharacter.PlayingCharacter;

public class Warrior extends PlayingCharacter {


    @Override
    public void attack(){
        System.out.println("This Warrior has strike a sword to the enemy");
    }

    @Override
    public void levelUp() {
        System.out.println("This Warrior has levelled up to lvl 9");
    }

    @Override
    public void move() {
        System.out.println("The Warrior Walked!");
    }
}
