import com.polymorphism.character.playingcharacter.PlayingCharacter;
import com.polymorphism.character.playingcharacter.mage.Mage;
import com.polymorphism.character.playingcharacter.marksman.Marksman;
import com.polymorphism.character.playingcharacter.unknown.UnknownCharacter;
import com.polymorphism.character.playingcharacter.warrior.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PlayingCharacter marksman = new Marksman();
        PlayingCharacter warrior =  new Warrior();
        PlayingCharacter mage = new Mage();
        PlayingCharacter unknown = new UnknownCharacter();


        List<PlayingCharacter> characters = new ArrayList<>();

        characters.add(marksman);
        characters.add(warrior);
        characters.add(mage);
        characters.add(unknown);

        for(PlayingCharacter p: characters){
            p.attack();
            p.levelUp();
            p.move();
        }

    }
}
