package epam_intro_online.module_2.decomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task15 {
    public static void main(String[] args) {
        int countOfDigits = 5;
        System.out.println(Arrays.toString(findNumbers(countOfDigits)));
    }

    public static Integer[] findNumbers(int countOfDigits) {
        List<Integer> listOfNumbers = new ArrayList<>();
        int start = 1;
        int end = 1;
        for (int i = 1; i < countOfDigits; i++) {
            start *= 10;
        }
        for (int i = 1; i <= countOfDigits; i++) {
            end *= 10;
        }
        end = end - 1;
        for (int i = start; i < end; i++) {
            if (sequenceCheck(i) == true) {
                listOfNumbers.add(i);
            }
        }
        Integer[] number = listOfNumbers.toArray(new Integer[listOfNumbers.size()]);
        return number;

    }

    public static boolean sequenceCheck(int number) {
        boolean isIncrease = true;
        List<Integer> listOfDigits = new ArrayList<>();
        while (number > 0) {
            listOfDigits.add(number % 10);
            number /= 10;
        }

        for (int i = 0; i < listOfDigits.size() - 1; i++) {
            if (listOfDigits.get(i) <= listOfDigits.get(i + 1)) {
                isIncrease = false;
                break;
            }
        }
        return isIncrease;
    }
}
