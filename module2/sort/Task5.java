package epam_intro_online.module_2.sort;

// Сортировка вставками - Insertion sort

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 5, -6, 9, 10, 0, 12, 16, 14, 29, -30, 32, 46};
        System.out.println(Arrays.toString(sortInsertionIncrease(array)));
    }

    public static int[] sortInsertionIncrease(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        return array;
    }
}