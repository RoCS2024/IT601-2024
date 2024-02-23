package com.project.temperature.converter;

public class Main {
    public static void main(String[] args) {
        CelsiusConverter celsiusConverter = new CelsiusConverter(25);
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter(77);
        KelvinConverter kelvinConverter = new KelvinConverter(300);

        System.out.println("Celsius: " + celsiusConverter.toCelsius());
        System.out.println("Fahrenheit: " + celsiusConverter.toFahrenheit());
        System.out.println("Kelvin: " + celsiusConverter.toKelvin());

        System.out.println("Celsius: " + fahrenheitConverter.toCelsius());
        System.out.println("Fahrenheit: " + fahrenheitConverter.toFahrenheit());
        System.out.println("Kelvin: " + fahrenheitConverter.toKelvin());

        System.out.println("Celsius: " + kelvinConverter.toCelsius());
        System.out.println("Fahrenheit: " + kelvinConverter.toFahrenheit());
        System.out.println("Kelvin: " + kelvinConverter.toKelvin());
    }
}