package com.project.temperature.converter;

public class KelvinConverter extends TemperatureConverter {

    public KelvinConverter(double temperature) {
        super(temperature);
    }

    @Override
    public double toCelsius() {
        return getTemperature() - 273.15;
    }

    @Override
    public double toFahrenheit() {
        return toCelsius() * 9 / 5 + 32;
    }

    @Override
    public double toKelvin() {
        return getTemperature();
    }
}
