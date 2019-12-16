package epam_intro_online.module_2.sort;

// Сортировка Шелла - Shell sort

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 5, -6, 9, 10, 0, 12, 16, 14, 29, -30, 32, 46};
        System.out.println(Arrays.toString(sortShellIncrease(array)));
    }


    public static int[] sortShellIncrease(int[] array) {
        int gap = array.length / 2;
        while (gap >= 1) {
            for (int right = 0; right < array.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        swap(array, c, c + gap);
                    }
                }
            }
            gap = gap / 2;
        }
        return array;
    }

    private static void swap(int[] array, int index1, int index2) {
        int newValue = array[index1];
        array[index1] = array[index2];
        array[index2] = newValue;
    }
}



