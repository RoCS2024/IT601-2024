public class TemperatureConverter {
    public static void main(String[] args) {
        // Example usage of Temperature class through TemperatureConverter
        Temperature temperature = new Temperature(32.0);

        double celsiusValue = temperature.getCelsius();
        double fahrenheitValue = temperature.celsiusToFahrenheit();

        System.out.println(celsiusValue + " degrees Celsius is equal to " + fahrenheitValue + " degrees Fahrenheit");

        temperature.setCelsius(67.0);

        celsiusValue = temperature.getCelsius();
        double newFahrenheitValue = temperature.celsiusToFahrenheit();

        System.out.println(celsiusValue + " degrees Celsius is equal to " + newFahrenheitValue + " degrees Fahrenheit");
    }

}
