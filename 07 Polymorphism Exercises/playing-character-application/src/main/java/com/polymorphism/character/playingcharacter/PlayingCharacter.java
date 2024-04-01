package com.polymorphism.character.playingcharacter;

public abstract class PlayingCharacter {


    public abstract void  attack();

    public abstract void levelUp();

    public void  move(){
        System.out.println("The player walked");
    }
}
