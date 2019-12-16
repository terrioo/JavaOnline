package epam_intro_online.module_2.decomposition;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 5, -6, 9, 10, 0, 12, 16, 0, 29, -30, 32, 0};
        System.out.println(findNumber(array));
    }

    public static int findNumber(int[] array) {
        int maxNumber = array[0];
        int maxNumber2 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber2 && array[i] < maxNumber) {
                maxNumber2 = array[i];
            }
        }
        return maxNumber2;
    }
}

