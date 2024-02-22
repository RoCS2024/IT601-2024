package com.hotel.room.application;

public class HotelRoom {
    private int numOfGuest;
    private int numOfDays;
    private boolean isReserved;

    public static final double CHARGE_PER_PERSON = 1250.0;
    public static final int MAX_GUEST = 10;

    public HotelRoom(int numOfGuest, int numOfDays, boolean isReserved) {
        this.numOfGuest = numOfGuest;
        this.numOfDays = numOfDays;
        this.isReserved = isReserved;

    }

    public int getNumOfGuest() {
        return numOfGuest;
    }

    public void setNumOfGuest(int numOfGuest) {
        this.numOfGuest = numOfGuest;
    }

    public int getNumOfDays() {
        return numOfDays;
    }

    public void setNumOfDays(int numOfDays) {
        this.numOfDays = numOfDays;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public double computeTotalCharge() {
        return numOfGuest * CHARGE_PER_PERSON * numOfDays;
    }
}
