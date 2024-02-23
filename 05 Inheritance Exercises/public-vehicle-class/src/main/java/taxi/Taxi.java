package taxi;

import publicvehicle.PublicVehicle;

public class Taxi extends PublicVehicle {
    public Taxi() {
        super(2.5);
    }

    @Override
    public double computeFare(double distance) {
        return getRatePerKm() * distance;
    }
}