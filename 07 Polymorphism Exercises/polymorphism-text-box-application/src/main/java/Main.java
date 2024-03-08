import com.polymorphism.text.box.TextBox;
import com.polymorphism.text.box.alphabet.Alphabet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * This is the main.
 * */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter alphabet value: ");
        String alphabetValue = scanner.nextLine();
        TextBox alphabet = new Alphabet(alphabetValue);


        List<TextBox> textBoxList = new ArrayList<>();
        textBoxList.add(alphabet);

        for (TextBox textBox : textBoxList) {
            textBox.enable();
            System.out.println("Value: " + textBox.value);
            System.out.println("Length: " + textBox.length());
            System.out.println();
        }
    }
}