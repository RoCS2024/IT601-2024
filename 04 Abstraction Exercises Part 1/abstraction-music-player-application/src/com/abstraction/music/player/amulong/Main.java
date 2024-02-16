package com.abstraction.music.player.amulong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();

        int choice;
        /**
         * In do Loop I do a program that can display first what the user what to do.
         * */
        do {
            System.out.println("Music Player Menu:");
            System.out.println("1. Add a song to the playlist");
            System.out.println("2. Remove a song from the playlist");
            System.out.println("3. Play a song");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            /**
             * I add switch so if the user choose more than the number I display it will have a message to it is invalid choice.
             * Then, the while condition is when the user choice is 4 it will be stopped.
             * */
            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the song to add: ");
                    String songToAdd = scanner.nextLine();
                    song.addSong(songToAdd);
                    break;
                case 2:
                    System.out.print("Enter the name of the song to remove: ");
                    String songToRemove = scanner.nextLine();
                    song.removeSong(songToRemove);
                    break;
                case 3:
                    System.out.print("Enter the number of the song to play: ");
                    int songNumberToPlay = scanner.nextInt();
                    scanner.nextLine();
                    song.playSong(songNumberToPlay);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
