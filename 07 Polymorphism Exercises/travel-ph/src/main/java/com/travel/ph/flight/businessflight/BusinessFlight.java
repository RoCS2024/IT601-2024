package com.travel.ph.flight.businessflight;

import com.travel.ph.flight.Flight;

public class BusinessFlight extends Flight {

    @Override
    public void book() {
        System.out.println("This Private flight has booked");
    }

    @Override
    public void cancel() {
        System.out.println("The Private flight has canceled.");
    }


}
