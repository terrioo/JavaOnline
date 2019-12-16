package epam_intro_online.module_4.ClassesAndObject.Task4_Train;


import java.io.IOException;
import java.time.LocalTime;

public class Controller {
    public static void main(String[] args) throws IOException {
        Train[] train = {
                new Train("Гомель", 14, LocalTime.parse("12:25")),
                new Train("Брест", 764, LocalTime.parse("14:15")),
                new Train("Витебск", 24, LocalTime.parse("12:45")),
                new Train("Могилев", 7, LocalTime.parse("11:35")),
                new Train("Витебск", 18, LocalTime.parse("18:10")),
        };

        TrainView.print(TrainLogic.sortByNumber(train));
        System.out.println();
        TrainLogic.findTrain(train);
        System.out.println();
        TrainView.print(TrainLogic.sortDestination(train));
    }
}
