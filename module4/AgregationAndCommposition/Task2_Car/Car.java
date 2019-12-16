package epam_intro_online.module_4.AgregationAndCommposition.Task2_Car;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private Wheel wheel;
    private Engine engine;
    private List<Wheel> wheels;

    public Car(String model, List<Wheel> wheels, Engine engine) {
        this.model = model;
        this.wheels = wheels;
        this.engine = engine;
    }

    public void fillTheCar() {
        System.out.println("Машина заправлена");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}

