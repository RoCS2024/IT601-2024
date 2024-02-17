import main.java.TextBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TextBox textBox1 = new TextBox("Initial Value", true);
        TextBox textBox2 = new TextBox("Another Value", false);

        textBox1.setValue("New Value");

        textBox2.setEnabled(true);

        TextBox.setMaxLength(15);

        System.out.print("Enter the text value: ");
        String inputValue = sc.nextLine();

        if (inputValue.length() > TextBox.getMaxLength()) {
            System.out.println("The input text exceeds the maximum length!");
        } else {
            System.out.println("The input text is within the maximum length.");
        }
        sc.close();
    }
}
