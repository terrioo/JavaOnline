package epam_intro_online.module_4.ClassesAndObject.Task4_Train;

import java.time.LocalTime;

public class Train {
    private String destination;
    private int number;
    private LocalTime departureTime;

    public Train(String destination, int number, LocalTime departureTime) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Task4_Train{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }
}
