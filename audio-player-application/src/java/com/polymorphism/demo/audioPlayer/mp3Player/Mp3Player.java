package com.polymorphism.demo.audioPlayer.mp3Player;

import com.polymorphism.demo.audioPlayer.AudioPlayer;

public class Mp3Player extends AudioPlayer {
    @Override
    public void play() {
        System.out.println("The Mp3 Player is playing");
    }
    @Override
    public void pause() {
        System.out.println("The Mp3 Player is pausing");
    }
    @Override
    public void stop() {
        System.out.println("The Mp3 Player is stopping");
    }
}
