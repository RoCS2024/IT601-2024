package com.music.player.abstraction.exercise.amulong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicPlayer musicPlayer = new MusicPlayer();

        int choice;
        do {
            System.out.println("Music Player Menu:");
            System.out.println("1. Add a song to the playlist");
            System.out.println("2. Remove a song from the playlist");
            System.out.println("3. Play a song from playlist 1");
            System.out.println("4. Play a song from playlist 2");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the song to add: ");
                    String songToAdd = sc.nextLine();
                    musicPlayer.addSong(songToAdd);
                    break;
                case 2:
                    System.out.print("Enter the name of the song to remove: ");
                    String songToRemove = sc.nextLine();
                    musicPlayer.removeSong(songToRemove);
                    break;
                case 3:
                    System.out.print("Enter the number of the song to play: ");
                    int playSong1 = sc.nextInt();
                    musicPlayer.playSongs(playSong1);
                    break;
                case 4:
                    System.out.print("Enter the number of the song to play: ");
                    int playSong2 = sc.nextInt();
                    musicPlayer.playSong2(playSong2);
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

