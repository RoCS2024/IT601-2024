package com.Hotel.Room.Project;

/**
 * This is the Hotel Room Class
 * */

public class HotelRoom {

    /**
     * This part are the Fields
     * */

    private int NumOfAdults;

    private int NumOfChildren;

    private int NumOfDays;

    public static int MaxNumOfAdult=2;

    public static int MaxNumOfChildren=1;

    public static double ChargePerPerson=1250.0;

    /**
     * This part is the Parameterized Constructor
     * */

    public HotelRoom (int NumOfAdults, int NumOfChildren, int NumOfDays) {
        this.NumOfAdults = NumOfAdults;
        this.NumOfChildren = NumOfChildren;
        this.NumOfDays = NumOfDays;
    }

    /**
     * This method gets the Sum of the Guest
     * */
    private int getSumOfGuest() {return this.NumOfAdults + this.NumOfChildren; }

    /**
     * This method gets the Total Charge
     * */
    public double getTotalCharge() {
        int TotalGuest = getSumOfGuest();
        int TotalDays = this.NumOfDays;
        double TotalCharge = (TotalGuest * ChargePerPerson * TotalDays);
        return TotalCharge;
    }


}
