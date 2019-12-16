package epam_intro_online.module_2.decomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task14 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findNumbersArmstrong(380)));
    }

    public static Integer[] findNumbersArmstrong(int k) {
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 1; i < k; i++) {
            if (isArmstrong(i) == true) {
                listOfNumbers.add(i);
            }
        }
        Integer[] number = listOfNumbers.toArray(new Integer[listOfNumbers.size()]);
        return number;
    }

    public static boolean isArmstrong(int number) {
        int numberCopy = number;
        boolean armstrong = false;
        String stringNumber = number + "";
        int countOfDigits = stringNumber.length();
        int summa = 0;

        while (numberCopy > 0) {
            summa += Math.pow(numberCopy % 10, countOfDigits);
            numberCopy /= 10;
        }
        if (summa == number) {
            armstrong = true;
        }

        return armstrong;
    }
}


