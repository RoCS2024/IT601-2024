package com.polymorphism.reserve;

public interface Facility {
    void addAppointment(Appointment appoint);
    void cancelAppointment(String Name,String Date);

    boolean limit(int number);

    Appointment currentEvent(String date);

    boolean dateTaken(String date);
}
