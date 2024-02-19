package com.hotel.room.application;

/**
 * This is the Hotel Room Class
 * */

public class HotelRoom {

    /**
     * This part are the Fields
     * */


    private int NumOfGuest;

    private int NumOfDays;

    public static double ChargePerPerson=1250.0;

    public  static double MaxOfGuest=10;

    /**
     * This part is the Parameterized Constructor
     * */

    public HotelRoom (int NumOfGuest,  int NumOfDays) {
        this.NumOfGuest = NumOfGuest;
        this.NumOfDays = NumOfDays;
    }

    /**
     * This method gets the Total Charge
     * */
    public double getTotalCharge() {
        int TotalGuest = this.NumOfGuest;
        int TotalDays = this.NumOfDays;
        double TotalCharge = (TotalGuest * ChargePerPerson * TotalDays);
        return TotalCharge;
    }

}
