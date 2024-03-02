class TemperatureConverter {
    private double value;
    private String currentTemperatureUnit;
    public TemperatureConverter() {
        this.value = 0.0;
    }

    public TemperatureConverter(double celsius) {
        this.value = celsius;
    }

    public double getCelsius() {
        return value;
    }

    public double getFahrenheit() {
        return celsiusToFahrenheit();
    }

    public void setCelsius(double celsius) {
        this.value = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.value = fahrenheitToCelsius(fahrenheit);
    }

    public double celsiusToFahrenheit() {
        return (value * 9 / 5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}