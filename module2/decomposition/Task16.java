package epam_intro_online.module_2.decomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task16 {
    public static void main(String[] args) {
        int countOfDigits = 4;
        long summa = findNumbers(countOfDigits);
        System.out.println("Summa of numbers with only odd digits is " + summa);
        System.out.println("Count of even digits in summa is " + findEvenNumber(summa));
    }

    public static long findNumbers(int countOfDigits) {
        long summa = 0;
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
            if (checkOddNumbers(i) == true) {
                summa += i;
            }
        }
        return summa;
    }

    public static boolean checkOddNumbers(int number) {
        boolean isOnlyOddNumbers = true;
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                isOnlyOddNumbers = false;
                break;
            }
            number /= 10;
        }
        return isOnlyOddNumbers;
    }

    public static int findEvenNumber(long number) {
        int count = 0;
        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}