import main.java.TextBox;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TextBox textBox1 = new TextBox();
        TextBox textBox2 = new TextBox();

        textBox1.setValue("New value");
        textBox2.setEnabled(true);

        textBox1.setMaxLength(15);

        System.out.print("Enter the text value: ");
        String inputValue = sc.nextLine();

        if (inputValue.length() > textBox1.getMaxLength()) {
            System.out.println("The input text is longer than allowed!");
        } else {
            System.out.println("The input text is allowed!");
        }
        sc.close();
    }
}
