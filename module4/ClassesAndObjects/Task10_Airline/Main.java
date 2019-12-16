package epam_intro_online.module_4.ClassesAndObject.Task10_Airline;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Airline[] airline = {
                new Airline("Minsk", 42, 'C', DayOfWeek.MONDAY, LocalTime.parse("12:25")),
                new Airline("Moskva", 22, 'D', DayOfWeek.WEDNESDAY, LocalTime.parse("14:15")),
                new Airline("Minsk", 54, 'C', DayOfWeek.SATURDAY, LocalTime.parse("16:05")),
                new Airline("Warsaw", 15, 'V', DayOfWeek.FRIDAY, LocalTime.parse("04:00")),
                new Airline("Paris", 19, 'K', DayOfWeek.SATURDAY, LocalTime.parse("12:55")),
                new Airline("Berlin", 64, 'C', DayOfWeek.MONDAY, LocalTime.parse("19:35")),
        };

        String destination = "Minsk";
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        LocalTime timeDeparture = LocalTime.parse("16:00");

        System.out.println("Find airline by destination " + destination + ":");
        AirlineLogic.print(AirlineLogic.findAirlinesByDestination(airline, destination));
        System.out.println("Find airline by day " + dayOfWeek + ":");
        AirlineLogic.print(AirlineLogic.findAirlinesByDay(airline, dayOfWeek));
        System.out.println("Find airline by day " + dayOfWeek + " and time " + timeDeparture + ":");
        AirlineLogic.print(AirlineLogic.findAirlinesByDayAndTime(airline, dayOfWeek, timeDeparture));
    }
}