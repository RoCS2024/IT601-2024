package com.polymorphism.reserve.facility.laboratory;

import java.util.ArrayList;

import com.polymorphism.reserve.Appointment;
import com.polymorphism.reserve.Facility;

public class Laboratory implements Facility {
    private ArrayList<Appointment> events = new ArrayList<Appointment>();
    private int limit = 50;
    @Override
    public void addAppointment(Appointment appoint) {
        events.add(appoint);
    }

    @Override
    public void cancelAppointment(String Name,String Date) {
        for(Appointment event : events){
            if((event.getName().equals(Name))&&(event.getDate().equals(Date))) {
                //events.indexOf(event);
                events.remove(events.indexOf(event));
                System.out.println("Laboratory Event removed successfully.");
                return;
            }
        }

        System.out.println("Event not found.");
    }

    @Override
    public boolean limit(int number) {
        if(number > limit)
            return true;

        return false;
    }

    @Override
    public Appointment currentEvent(String date) {
        for(Appointment event : events){
            if(event.getDate().equals(date)) {
                return event;
            }
        }
        return null;
    }

    @Override
    public boolean dateTaken(String date) {
        for(Appointment event : events){
            if(event.getDate().equals(date)) {
                return true;
            }
        }
        return false;
    }
}

