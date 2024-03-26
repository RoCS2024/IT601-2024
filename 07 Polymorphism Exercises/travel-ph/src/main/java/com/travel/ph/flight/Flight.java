package com.travel.ph.flight;

import java.util.ArrayList;
import java.util.List;

public abstract class Flight {

    public void book() {

        System.out.println("The flight has booked");

    }

    public abstract void cancel();
}