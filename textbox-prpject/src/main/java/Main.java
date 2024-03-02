import com.textbox.EmailTextBox;
import com.textbox.PasswordTextBox;
import com.textbox.TextBox;

public class Main {
    public static void main(String[] args) {
        TextBox textBox = new TextBox("new value", true, 10);
        System.out.println("Textbox value: " + textBox.getValue());

        EmailTextBox emailTextBox = new EmailTextBox("stevenrabacal@gmail.com", true, 20);
        System.out.println("Emailtextbox : " + emailTextBox.getValue());
        System.out.println("The Emailtextbox is valid: " + emailTextBox.isValidEmail());

        PasswordTextBox passwordTextBox = new PasswordTextBox("stevenrabacalalvarez", true, 12, false);
        System.out.println("Passwordtexbox : " + passwordTextBox.getMaskedValue());
    }
}