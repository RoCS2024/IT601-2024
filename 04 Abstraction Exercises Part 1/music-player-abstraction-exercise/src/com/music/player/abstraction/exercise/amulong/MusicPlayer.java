package com.music.player.abstraction.exercise.amulong;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private static List<String> playlist;
    private List<String> playlist2;

    public MusicPlayer() {
        this.playlist = new ArrayList<>();
        this.playlist2 = new ArrayList<>(this.playlist);
    }

    public void addSong(String song) {
        playlist.add(song);
        playlist2.add(song);
        System.out.println(song + " added to the both playlist.");
    }

    public void removeSong(String song) {
        if (playlist.contains(song)) {
            playlist.remove(song);
            playlist2.remove(song);
            System.out.println(song + " removed from the both playlist.");
        } else {
            System.out.println(song + " is not in the both playlist.");
        }
    }

    public void playSongs(int songNumber) {
        playSong(songNumber, this.playlist, "BLINK");
    }

    public void playSong2(int songNumber) {
        playSong(songNumber, this.playlist2, "BABY MONSTER");
    }

    private void playSong(int songNumber, List<String> playlist, String playlistName) {
        if (songNumber >= 1 && songNumber <= playlist.size()) {
            System.out.println("Playing from " + playlistName + ": " + playlist.get(songNumber - 1));
        } else {
            System.out.println("NO SONG IN THIS NUMBER!!! " + playlistName);
        }
    }
}
