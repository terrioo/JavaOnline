package epam_intro_online.module_4.ClassesAndObject.Task10_Airline;

import java.time.LocalTime;

public class Airline {


    private String destination;
    private int flightNumber;
    private char type;
    private LocalTime timeDeparture;
    private DayOfWeek dayOfWeek;

    public Airline(String destination, int flightNumber, char type, DayOfWeek dayOfWeek, LocalTime timeDeparture) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.type = type;
        this.timeDeparture = timeDeparture;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public LocalTime getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(LocalTime timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", type=" + type +
                ", dayOfWeek=" + dayOfWeek +
                ", timeDeparture=" + timeDeparture +
                '}';
    }



}
