package epam_intro_online.module_4.ClassesAndObject.Task10_Airline;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AirlineLogic {
    public static List<Airline> findAirlinesByDestination(Airline[] airline, String destination) {
        List<Airline> listOfAirlines = new ArrayList<>();
        for (Airline airline1 : airline) {
            if (airline1.getDestination().equals(destination)) {
                listOfAirlines.add(airline1);
            }
        }
        return listOfAirlines;
    }

    public static List<Airline> findAirlinesByDay(Airline[] airline, DayOfWeek dayOfWeek) {
        List<Airline> listOfAirlines = new ArrayList<>();
        for (Airline airline1 : airline) {
            if (airline1.getDayOfWeek().equals(dayOfWeek)) {
                listOfAirlines.add(airline1);
            }
        }
        return listOfAirlines;
    }

    public static List<Airline> findAirlinesByDayAndTime(Airline[] airline, DayOfWeek dayOfWeek, LocalTime timeDeparture) {
        List<Airline> listOfAirlines = new ArrayList<>();
        for (Airline airline1 : airline) {
            if (airline1.getDayOfWeek().equals(dayOfWeek) && airline1.getTimeDeparture().isAfter(timeDeparture)) {
            // LocalTime.isAfter (isBefore) - сравнение времени
                listOfAirlines.add(airline1);
            }
        }
        return listOfAirlines;
    }

    public static void print(List<Airline> airline) {
        for (Airline airline1 : airline) {
            System.out.println(airline1);
        }
    }
}
