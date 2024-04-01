package com.polymorphism.demo.audioPlayer.m4aPlayer;

import com.polymorphism.demo.audioPlayer.AudioPlayer;

public class M4aPlayer extends AudioPlayer {
    @Override
    public void play() {
        System.out.println("The M4a Player is playing");
    }
    @Override
    public void pause() {
        System.out.println("The M4a Player is pausing");
    }
    @Override
    public void stop() {
        System.out.println("The M4a Player is stopping");
    }
}


