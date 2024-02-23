package com.project.temperature.converter;

public class CelsiusConverter extends TemperatureConverter {

    public CelsiusConverter(double temperature) {
        super(temperature);
    }

    @Override
    public double toCelsius() {
        return getTemperature();
    }

    @Override
    public double toFahrenheit() {
        return getTemperature() * 9 / 5 + 32;
    }

    @Override
    public double toKelvin() {
        return getTemperature() + 273.15;
    }
}
