package ReserveFacility;
import java.util.ArrayList;
public class Auditorium implements Facility{

    private ArrayList<Appointment> events = new ArrayList<Appointment>();
    private int limit = 150;

    //private int total = 0;
    @Override
    public void addAppointment(Appointment appoint) {
        events.add(appoint);
        //total += appoint.getNumberOfPersons();
    }

    @Override
    public void cancelAppointment(String Name,String Date) {
        for(Appointment event : events){
            if((event.getName().equals(Name))&&(event.getDate().equals(Date))) {
                //events.indexOf(event);
                events.remove(events.indexOf(event));
                System.out.println("Auditorium Event removed successfully.");
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
            if(event.getDate().equals(date) ) {
                return true;
            }
        }
        return false;
    }
}
