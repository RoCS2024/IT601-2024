package com.abstraction.music.player.amulong;

import java.util.ArrayList;
import java.util.List;

public class Song {
    private static List<String> playlist;

    public Song() {
        this.playlist = new ArrayList<>();
    }
    /**
     * This method is for adding a song.
     * */
    public void addSong(String song) {
        playlist.add(song);
        System.out.println( song + " added to the playlist.");
    }
    /**
     * This method is for removing or deleting the song that is inside the playlist.
     * */
    public void removeSong(String song) {
        if (playlist.contains(song)) {
            playlist.remove(song);
            System.out.println(song + " removed from the playlist.");
        } else {
            System.out.println(song + " is not in the playlist.");
        }
    }
    /**
     * This method is for choosing the song that you want to play.
     * */
    public void playSong(int songNumber) {
        if (songNumber >= 1 && songNumber <= playlist.size()) {
            System.out.println("Playing: " + playlist.get(songNumber - 1));
        } else {
            System.out.println("Invalid Number. No song found at that number " + songNumber);
        }
    }
}
