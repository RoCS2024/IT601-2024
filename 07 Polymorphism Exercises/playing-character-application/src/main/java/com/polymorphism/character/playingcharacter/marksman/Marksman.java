package com.polymorphism.character.playingcharacter.marksman;

import com.polymorphism.character.playingcharacter.PlayingCharacter;

public class Marksman extends PlayingCharacter {

    @Override
    public void attack(){
        System.out.println("This Marksman shoots the enemy");
    }

    @Override
    public void levelUp() {
        System.out.println("This Marksman has levelled up to lvl 15");
    }

    @Override
    public void move() {
        System.out.println("The Marksman Walked!");
    }
}
