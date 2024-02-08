package main.java.musicplayer.mariano;

import java.util.ArrayList;
import java.util.List;
class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    @Override
    public String toString() {
        return "'" + title + "' by " + artist;
    }
}

public class MusicPlayer {
    private List<Song> playlist;

    public MusicPlayer() {
        this.playlist = new ArrayList<>();
    }

    public void addSong(Song song) {
        playlist.add(song);
        System.out.println("Song added successfully.");
    }

    public void removeSong(String title) {
        for (Song song : playlist) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                playlist.remove(song);
                System.out.println("Song removed successfully.");
                return;
            }
        }
        System.out.println("Song '" + title + "' not found in the playlist.");
    }

    public void playSong(String title) {
        for (Song song : playlist) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Playing: " + song);
                return;
            }
        }
        System.out.println("Song '" + title + "' not found in the playlist.");
    }

    public void displayPlaylist() {
        System.out.println("Current Playlist:");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println((i + 1) + ": " + playlist.get(i));
        }
    }
}