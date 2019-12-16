package epam_intro_online.module_4.AgregationAndCommposition.Task2_Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        Wheel wheel4 = new Wheel();
        List<Wheel> wheels = new ArrayList<>();
        wheels.add(wheel1);
        wheels.add(wheel2);
        wheels.add(wheel3);
        wheels.add(wheel4);

        Engine engine = new Engine();
        Car car = new Car("Mazda", wheels, engine);
        wheel2.changeWheel();
        car.fillTheCar();
        engine.engineIsOn = true;
        engine.move();
        System.out.println(car.getModel());
    }
}