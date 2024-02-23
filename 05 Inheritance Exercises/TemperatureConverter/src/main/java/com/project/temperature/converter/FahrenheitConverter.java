package com.project.temperature.converter;

public class FahrenheitConverter extends TemperatureConverter {

    public FahrenheitConverter(double temperature) {
        super(temperature);
    }

    @Override
    public double toCelsius() {
        return (getTemperature() - 32) * 5 / 9;
    }

    @Override
    public double toFahrenheit() {
        return getTemperature();
    }

    @Override
    public double toKelvin() {
        return toCelsius() + 273.15;
    }
}
