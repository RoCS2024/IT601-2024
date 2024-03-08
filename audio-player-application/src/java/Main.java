import com.polymorphism.demo.audioPlayer.AudioPlayer;
import com.polymorphism.demo.audioPlayer.m4aPlayer.M4aPlayer;
import com.polymorphism.demo.audioPlayer.mp3Player.Mp3Player;
import com.polymorphism.demo.audioPlayer.mp4Player.Mp4Player;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        M4aPlayer m4aPlayer = new M4aPlayer();
        Mp3Player mp3Player = new Mp3Player();
        Mp4Player mp4Player = new Mp4Player();

        List<AudioPlayer> audioPlayers = new ArrayList<>();

        audioPlayers.add(m4aPlayer);
        audioPlayers.add(mp3Player);
        audioPlayers.add(mp4Player);

        for (AudioPlayer player : audioPlayers) {
            player.play();
            player.pause();
            player.stop();
            System.out.println();
        }
    }
}
