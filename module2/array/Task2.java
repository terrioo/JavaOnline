package epam_intro_online.module_2.array;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 9, 10, 11, 12, 16, 18, 29, 30, 32};
        int number = 7;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                array[i] = number;
                count++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Count of number >" + number + " is " + count);
    }
}
