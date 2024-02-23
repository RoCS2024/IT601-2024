package jeep;

import publicvehicle.PublicVehicle;

public class Jeep extends PublicVehicle {
    public Jeep() {
        super(2);
    }

    @Override
    public double computeFare(double distance) {
        return getRatePerKm() * distance;
    }
}