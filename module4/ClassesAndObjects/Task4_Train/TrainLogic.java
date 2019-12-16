package epam_intro_online.module_4.ClassesAndObject.Task4_Train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class TrainLogic {

    public static Train[] sortByNumber(Train[] train) {
        for (int i = 0; i < train.length - 1; i++) {
            for (int j = 0; j < train.length - i - 1; j++) {
                if (train[j].getNumber() > train[j + 1].getNumber()) {
                    Train temp = train[j];
                    train[j] = train[j + 1];
                    train[j + 1] = temp;
                }
            }
        }
        return train;
    }

    public static void findTrain(Train[] train) throws IOException {
        System.out.println("Введите номер поезда, который вас интересует");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTrain = Integer.parseInt(reader.readLine());
        int count = 0;
        for (Train someTrain : train) {
            if (someTrain.getNumber() == numberOfTrain) {
                count++;
                System.out.println(someTrain);
            }
        }
        if (count == 0) {
            System.out.println("Такого поезда не существует");
        }
    }

    public static Train[] sortDestination(Train[] train) {
        Comparator<Train> destinationAndTime = Comparator.comparing(Train::getDestination).thenComparing(Train::getDepartureTime);
        Arrays.stream(train).sorted(destinationAndTime);
        return train;
    }
}
