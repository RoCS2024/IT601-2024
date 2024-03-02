package com.music.player.abstraction.exercise.amulong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicPlayer musicPlayer1 = new MusicPlayer();
        MusicPlayer musicPlayer2 = new MusicPlayer();

        int choice;
        do {
            System.out.println("Music Player Menu:");
            System.out.println("1. Add a song to the playlist");
            System.out.println("2. Remove a song from the playlist");
            System.out.println("3. Play a song from Music Player 1");
            System.out.println("4. Play a song from Music Player 2");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the song to add: ");
                    String songToAdd = sc.nextLine();
                    musicPlayer1.addSong(songToAdd);
                    musicPlayer2.addSong(songToAdd);
                    break;
                case 2:
                    System.out.print("Enter the name of the song to remove: ");
                    String songToRemove = sc.nextLine();
                    musicPlayer1.removeSong(songToRemove);
                    musicPlayer2.removeSong(songToRemove);
                    break;
                case 3:
                    System.out.print("Enter the number of the song to play: ");
                    int playSong = sc.nextInt();
                    musicPlayer1.playSongs(playSong);
                    break;
                case 4:
                    System.out.print("Enter the number of the song to play: ");
                    playSong = sc.nextInt();
                    musicPlayer2.playSongs(playSong);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}

