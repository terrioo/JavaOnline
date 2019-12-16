package epam_intro_online.module_2.array;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 5, -6, 9, 10, 0, 12, 16, 0, 29, -30, 32, 0};
        System.out.println(Arrays.toString(changeMaxMin(array)));
    }

    public static int[] changeMaxMin(int[] array) {
        int maxIndex = 0;
        int minIndex = 0;
        int maxNumber = array[0];
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
                maxIndex = i;
            }
            if (array[i] < minNumber) {
                minNumber = array[i];
                minIndex = i;
            }
        }
        array[maxIndex] = minNumber;
        array[minIndex] = maxNumber;
        return array;
    }
}
