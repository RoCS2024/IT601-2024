package com.Hotel.Room.Project;

public class HotelRoom {

    private int NumOfAdults;

    private int NumOfChildren;

    private int NumOfDays;

    public static int MaxNumOfAdult=2;

    public static int MaxNumOfChildren=1;

    public static double ChargePerPerson=1250.0;


    public HotelRoom (int NumOfAdults, int NumOfChildren, int NumOfDays) {
        this.NumOfAdults = NumOfAdults;
        this.NumOfChildren = NumOfChildren;
        this.NumOfDays = NumOfDays;
    }

    private int getSumOfGuest() {return this.NumOfAdults + this.NumOfChildren; }

    public double getTotalCharge() {
        int TotalGuest = getSumOfGuest();
        int TotalDays = this.NumOfDays;
        double TotalCharge = (TotalGuest * ChargePerPerson * TotalDays);
        return TotalCharge;
    }


}
