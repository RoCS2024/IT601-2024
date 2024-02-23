package com.project.temperature.converter;

public abstract class TemperatureConverter {
    protected double temperature;

    public TemperatureConverter(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public abstract double toCelsius();

    public abstract double toFahrenheit();

    public abstract double toKelvin();
}
