package main.java.musicplayer.mariano;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        Scanner scanner = new Scanner(System.in);

        // Adding some sample songs to the playlist
        player.addSong(new Song("Shut Down", "Blackpink"));
        player.addSong(new Song("Radio", "Lana Del Rey"));
        player.addSong(new Song("Flowers", "Miley Cyrus"));
        player.addSong(new Song("Cardigan", "Taylor Swift"));

        while (true) {
            System.out.println("\n1. Add Song\n2. Remove Song\n3. Play Song\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // another line

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist: ");
                    String artist = scanner.nextLine();
                    player.addSong(new Song(title, artist));
                    break;
                case 2:
                    player.displayPlaylist();
                    System.out.print("Enter song title to remove: ");
                    String removeTitle = scanner.nextLine();
                    player.removeSong(removeTitle);
                    System.exit(0);
                    break;
                case 3:
                    player.displayPlaylist();
                    System.out.print("Enter song title to play: ");
                    String playTitle = scanner.nextLine();
                    player.playSong(playTitle);
                    System.exit(0);
                    break;
                case 4:
                    System.out.println("Stop playing...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
