package ReserveFacility;

public class Appointment extends Visitor{
    private String eventName = "";
    private String eventDate = "";

    public void setEventName(String eventName){
        this.eventName = eventName;
    }

    public void setDate(String eventDate){
        this.eventDate = eventDate;
    }

    public String getEventName(){
        return eventName;
    }

    public String getDate(){
        return eventDate;
    }
}
