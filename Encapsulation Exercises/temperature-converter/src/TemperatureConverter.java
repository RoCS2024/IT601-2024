import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperatureValue = scanner.nextDouble();

        System.out.print("Enter the current temperature unit (C for Celsius, F for Fahrenheit): ");
        char currentUnit = scanner.next().charAt(0);

        Temperature_Converter temperatureConverter;

        if (currentUnit == 'C' || currentUnit == 'c') {
            temperatureConverter = new Temperature_Converter(temperatureValue);
        } else if (currentUnit == 'F' || currentUnit == 'f') {
            temperatureConverter = new Temperature_Converter();
            temperatureConverter.setFahrenheit(temperatureValue);
        } else {
            System.out.println("Invalid temperature unit. Please enter C or F.");
            return;
        }

        double celsiusValue = temperatureConverter.getCelsius();
        double fahrenheitValue = temperatureConverter.getFahrenheit();

        System.out.println("Entered temperature: " + temperatureValue + " " + (currentUnit == 'C' || currentUnit == 'c' ? "Celsius" : "Fahrenheit"));
        System.out.println("Converted temperature: " + celsiusValue + " Celsius is equal to " + fahrenheitValue + " Fahrenheit");
    }
}