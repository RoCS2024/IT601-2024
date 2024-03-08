package com.travel.ph.flight.economyflight;

import com.travel.ph.flight.Flight;

public class EconomyFlight extends Flight {

    @Override
    public void book() {
        System.out.println("The Commercial flight has booked. ");
    }

    @Override
    public void cancel() {
        System.out.println("The Commercial flight has canceled.");
    }


}
