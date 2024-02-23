package publicvehicle;

public abstract class PublicVehicle {
    private double ratePerKm;

    public PublicVehicle(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public abstract double computeFare(double distance);

    public double getRatePerKm() {
        return ratePerKm;
    }
}