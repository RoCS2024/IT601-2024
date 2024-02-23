package bus;

import publicvehicle.PublicVehicle;

public class Bus extends PublicVehicle {
    public Bus() {
        super(1.5);
    }

    @Override
    public double computeFare(double distance) {
        return getRatePerKm() * distance;
    }
}