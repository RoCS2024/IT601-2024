package com.polymorphism.demo.audioPlayer.mp4Player;

import com.polymorphism.demo.audioPlayer.AudioPlayer;

public class    Mp4Player extends AudioPlayer {
    @Override
    public void play() {
        System.out.println("The Mp4 Player is playing");
    }
    @Override
    public void pause() {
        System.out.println("The Mp4 Player is pausing");
    }
    @Override
    public void stop() {
        System.out.println("The Mp4 Player is stopping");
    }
}
