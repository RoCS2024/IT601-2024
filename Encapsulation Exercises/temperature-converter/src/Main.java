import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperatureValue = scanner.nextDouble();

        System.out.print("Enter the current temperature unit (C for Celsius, F for Fahrenheit): ");
        char currentUnit = scanner.next().charAt(0);

        TemperatureConverter temperatureConverter;

        if (currentUnit == 'C' || currentUnit == 'c') {
            temperatureConverter = new TemperatureConverter(temperatureValue);
            double celsiusValue = temperatureConverter.getCelsius();
            double fahrenheitValue = temperatureConverter.getFahrenheit();
            System.out.println("Entered temperature: " + temperatureValue + " " + (currentUnit == 'C' || currentUnit == 'c' ? "Celsius" : "Fahrenheit"));
            System.out.println("Converted temperature: " + celsiusValue + " Celsius is equal to " + fahrenheitValue + " Fahrenheit");
        } else if (currentUnit == 'F' || currentUnit == 'f') {
            temperatureConverter = new TemperatureConverter();
            temperatureConverter.setFahrenheit(temperatureValue);
            double celsiusValue = temperatureConverter.getCelsius();
            double fahrenheitValue = temperatureConverter.getFahrenheit();
            System.out.println("Entered temperature: " + temperatureValue + " " + (currentUnit == 'C' || currentUnit == 'c' ? "Celsius" : "Fahrenheit"));
            System.out.println("Converted temperature: " + fahrenheitValue + " Fahrenheit is equal to " + celsiusValue + " Celsius ");
        } else {
            System.out.println("Invalid temperature unit. Please enter C or F.");
            return;
        }
    }
}