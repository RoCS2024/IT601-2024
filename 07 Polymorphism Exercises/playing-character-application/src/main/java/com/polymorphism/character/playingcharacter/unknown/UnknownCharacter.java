package com.polymorphism.character.playingcharacter.unknown;

import com.polymorphism.character.playingcharacter.PlayingCharacter;

public final class UnknownCharacter extends PlayingCharacter {

    @Override
    public void attack(){
        System.out.println("This Unknown Character attacks the enemy");
    }

    @Override
    public void levelUp() {
        System.out.println("This Unknown Character has levelled up to lvl 12");
    }

    @Override
    public void move() {
        System.out.println("The Unknown Character Walked!");
    }
}

