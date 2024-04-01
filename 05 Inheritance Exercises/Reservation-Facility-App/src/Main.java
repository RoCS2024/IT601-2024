import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;
import ReserveFacility.*;

public class Main {

    public static void main(String[]args){
        Auditorium audi = new Auditorium();
        Gym gym = new Gym();
        Laboratory laboratory = new Laboratory();
        int run = 1;
        int event = 0;
        int choice;

        Scanner scanner = new Scanner(System.in);
        do{

            System.out.println("1. Book an event");
            System.out.println("2. Cancel an event");
            System.out.println("3. Search an event");
            System.out.println("4. Exit the App");
            System.out.println("Hello! What do you want to do?:");

            choice  = scanner.nextInt();

            switch (choice){
                case 1 :{
                    scanner.nextLine();
                    System.out.println("Enter your name:");
                    String name = scanner.nextLine();
                    System.out.println("Hello " + name + ".What facility are you going to use (1.Laboratory || Capacity = 50, 2.Auditorium || Capacity = 150, 3.Gym || Capacity = 500: ");
                    int facility = scanner.nextInt();
                    int visitor = 0;
                    while(true){
                        System.out.println("How many Visitors?: ");
                        visitor = scanner.nextInt();
                        if(facility == 1){
                            if(!laboratory.limit(visitor)){
                                break;
                            }
                            else{
                                System.out.println("Capacity Exceeded.");
                            }
                        }
                        else if(facility == 2){
                            if(!audi.limit(visitor)){
                                break;
                            }
                            else{
                                System.out.println("Capacity Exceeded.");
                            }
                        }
                        else{
                            if(!gym.limit(visitor)){
                                break;
                            }
                            else{
                                System.out.println("Capacity Exceeded.");
                            }
                        }
                    }
                    //System.out.println("When will the event take place?: ");
                    String eventDate = "";
                    scanner.nextLine();
                    while(true){

                        System.out.println("When will the event take place? (YYYY-MM-DD): ");
                        eventDate = scanner.nextLine();
                        if(facility == 1){
                            if(!laboratory.dateTaken(eventDate)){
                                break;
                            }
                            else{
                                System.out.println("Date Taken");
                            }
                        }
                        else if(facility == 2){
                            if(!audi.dateTaken(eventDate)){
                                break;
                            }
                            else{
                                System.out.println("Date Taken");
                            }
                        }
                        else{
                            if(!gym.dateTaken(eventDate)){
                                break;
                            }
                            else{
                                System.out.println("Date Taken");
                            }
                        }
                    }

                    System.out.println("What Event? : ");
                    String eventMain = scanner.nextLine();

                    if(facility == 1){
                        Appointment appoint = new Appointment();
                        appoint.setName(name);
                        appoint.setNumberOfPersons(visitor);
                        appoint.setEventName(eventMain);
                        appoint.setDate(eventDate);
                        laboratory.addAppointment(appoint);

                    }
                    else if(facility == 2){
                        Appointment appoint = new Appointment();
                        appoint.setName(name);
                        appoint.setNumberOfPersons(visitor);
                        appoint.setEventName(eventMain);
                        appoint.setDate(eventDate);
                        audi.addAppointment(appoint);
                    }
                    else if(facility == 3){
                        Appointment appoint = new Appointment();
                        appoint.setName(name);
                        appoint.setNumberOfPersons(visitor);
                        appoint.setEventName(eventMain);
                        appoint.setDate(eventDate);
                        gym.addAppointment(appoint);
                    }
                    else{
                        break;
                    }
                }break;
                case 2:{
                    System.out.println("What facility has your reservation (1.Laboratory , 2.Auditorium , 3.Gym : ");
                    int facility = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.println("Date of the event? (YYYY-MM-DD): ");
                    String eventDate = scanner.nextLine();
                    if(facility == 1){

                        laboratory.cancelAppointment(name,eventDate);

                    }
                    else if(facility == 2){

                        audi.cancelAppointment(name,eventDate);
                    }
                    else if(facility == 3){
                        gym.cancelAppointment(name,eventDate);
                    }
                    else{
                        break;
                    }
                }break;
                case 3:{
                    System.out.println("What facility you want to check? (1.Laboratory , 2.Auditorium , 3.Gym : ");
                    int facility = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Date of the event? (YYYY-MM-DD): ");
                    String eventDate = scanner.nextLine();
                    System.out.println(eventDate);
                    if(facility == 1){
                        Appointment event1 = laboratory.currentEvent(eventDate);
                        if(event1 != null){
                            System.out.println("Current Event");
                            System.out.println("Event Name : "+event1.getEventName());
                            System.out.println("Date : "+event1.getDate());
                        }
                        else{
                            System.out.println("Event Not found.");
                        }

                    }
                    else if(facility == 2){
                        Appointment event1 = audi.currentEvent(eventDate);
                        if(event1 != null){
                            System.out.println("Current Event");
                            System.out.println("Event Name : "+event1.getEventName());
                            System.out.println("Date : "+event1.getDate());
                        }
                        else{
                            System.out.println("Event Not found.");
                        }
                    }
                    else if(facility == 3){
                        Appointment event1 = gym.currentEvent(eventDate);
                        if(event1 != null){
                            System.out.println("Current Event");
                            System.out.println("Event Name : "+event1.getEventName());
                            System.out.println("Date : "+event1.getDate());
                        }
                        else{
                            System.out.println("Event Not found.");
                        }
                    }
                    else{
                        break;
                    }
                }break;
                case 4:{
                    run = 0;
                }break;

            }
            System.out.println("Press any number to do another transaction...");
            int another = scanner.nextInt();
        } while (run == 1);
        scanner.close();
        System.exit(0);
    }
}
