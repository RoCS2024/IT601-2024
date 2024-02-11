package main.java.musicplayer.mariano;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<String> playlist;
    private String currentSong;

    public MusicPlayer() {
        this.playlist = new ArrayList<>();
        this.currentSong = null;
    }

    public void addSong(String title) {
        playlist.add(title);
        System.out.println("Song added successfully.");
    }

    public void removeSong(String title) {
        if (playlist.remove(title)) {
            if (currentSong != null && currentSong.equalsIgnoreCase(title)) {
                currentSong = null; // Reset current song if the removed song was the current one
            }
            System.out.println("Song removed successfully.");
        } else {
            System.out.println("Song '" + title + "' not found in the playlist.");
        }
    }

    public void playSong(String title) {
        if (playlist.contains(title)) {
            currentSong = title;
            System.out.println("Playing: " + currentSong);
        } else {
            System.out.println("Song '" + title + "' not found in the playlist.");
        }
    }

    public void displayPlaylist() {
        System.out.println("Current Playlist:");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ": " + playlist.get(i));
        }
    }

    public String getCurrentSong() {
        if (currentSong != null) {
            return currentSong;
        } else {
            return "No song is currently playing.";
        }
    }

    public void setCurrentSong(String currentSong) {
        this.currentSong = currentSong;
    }

    public List<String> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<String> playlist) {
        this.playlist = playlist;
    }
}