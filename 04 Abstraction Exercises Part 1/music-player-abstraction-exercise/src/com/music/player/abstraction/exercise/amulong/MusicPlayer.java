package com.music.player.abstraction.exercise.amulong;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private static List<String> playlist;

    public MusicPlayer() {
        this.playlist = new ArrayList<>();
    }

    public void addSong(String song) {
        playlist.add(song);
        System.out.println(song + " added to the both playlist.");
    }

    public void removeSong(String song) {
        if (playlist.contains(song)) {
            playlist.remove(song);
            System.out.println(song + " removed from the both playlist.");
        } else {
            System.out.println(song + " is not in the both playlist.");
        }
    }

    public void playSongs(int songNumber) {
        playSong(songNumber, this.playlist, "BLINK");
    }

    public void playSong2(int songNumber) {
        playSong(songNumber, this.playlist, "BABY MONSTER");
    }

    private void playSong(int songNumber, List<String> playlist, String playlistName) {
        if (songNumber >= 1 && songNumber <= playlist.size()) {
            System.out.println("Playing from " + playlistName + ": " + playlist.get(songNumber - 1));
        } else {
            System.out.println("NO SONG IN THIS NUMBER!!! " + playlistName);
        }
    }
}
