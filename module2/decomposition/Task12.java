package epam_intro_online.module_2.decomposition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArray(28, 10000)));
    }

    public static Integer[] fillArray(int K, int N) {
        List<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (SumOfDigits(i) == K) {
                listOfNumbers.add(i);
            }
        }
        Integer[] number = listOfNumbers.toArray(new Integer[listOfNumbers.size()]);
        return number;
    }


    public static int SumOfDigits(int number) {
        int summa = 0;
        while (number > 0) {
            summa += number % 10;
            number /= 10;
        }
        return summa;
    }
}
