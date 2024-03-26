
import com.travel.ph.flight.Flight;
import com.travel.ph.flight.businessflight.BusinessFlight;
import com.travel.ph.flight.economyflight.EconomyFlight;
import com.travel.ph.flight.firstclass.FirstClass;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Flight economyFlight = new EconomyFlight();
        Flight businessFlight = new BusinessFlight();
        Flight firstClass = new FirstClass();

        List<Flight> flights = new ArrayList<>();
        flights.add(firstClass);
        flights.add(businessFlight);
        flights.add(economyFlight);

        for (Flight a : flights) {
            a.book();
            a.cancel();
        }

    }
}