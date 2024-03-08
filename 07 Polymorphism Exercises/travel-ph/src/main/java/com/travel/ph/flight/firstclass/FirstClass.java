package com.travel.ph.flight.firstclass;

import com.travel.ph.flight.Flight;

public class FirstClass extends Flight {

    @Override
    public void cancel() {
        System.out.println("The first class flight has canceled");
    }

    @Override
    public void book() {
        System.out.println("The first class flight has booked");
    }

}
