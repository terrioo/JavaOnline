package epam_intro_online.module_2.decomposition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task13 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> listOfNumbers = findSimpleTwins(3, 105);
        for (Map.Entry<Integer, Integer> entry : listOfNumbers.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }

    public static HashMap<Integer, Integer> findSimpleTwins(int from, int to) {
        HashMap<Integer, Integer> listOfNumbers = new HashMap<>();
        for (int i = from; i <= to; i++) {
            if (checkSimple(i) && checkSimple(i + 2)) {
                listOfNumbers.put(i, i + 2);
            }
        }
        return listOfNumbers;
    }

    public static boolean checkSimple(int number) {
        boolean simple = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                simple = false;
                break;
            }
        }
        return simple;
    }
}

