package main.java.musicplayer.mariano;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        Scanner scanner = new Scanner(System.in);

        // Adding some sample songs to the playlist
        player.addSong("Shut Down");
        player.addSong("Radio");
        player.addSong("Flowers");
        player.addSong("Cardigan");

        while (true) {
            System.out.println("\n1. Add Song\n2. Remove Song\n3. Play Song\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    player.displayPlaylist();
                    System.out.print("Enter song title to be added: ");
                    String titleToAdd = scanner.nextLine();
                    if (!player.getPlaylist().contains(titleToAdd)) {
                        player.addSong(titleToAdd);
                    } else {
                        System.out.println("Song '" + titleToAdd + "' is already in the playlist.");
                    }
                    break;
                case 2:
                    player.displayPlaylist();
                    System.out.print("Enter song title to remove: ");
                    String titleToRemove = scanner.nextLine();
                    if (player.getPlaylist().contains(titleToRemove)) {
                        player.removeSong(titleToRemove);
                    } else {
                        System.out.println("Song '" + titleToRemove + "' not found in the playlist.");
                    }
                    break;
                case 3:
                    player.displayPlaylist();
                    System.out.print("Enter song title to play: ");
                    String titleToPlay = scanner.nextLine();
                    if (player.getPlaylist().contains(titleToPlay)) {
                        player.playSong(titleToPlay);
                        System.out.println("Currently playing: " + player.getCurrentSong());
                    } else {
                        System.out.println("Song '" + titleToPlay + "' not found in the playlist.");
                    }
                    break;
                case 4:
                    System.out.println("Stop playing...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}