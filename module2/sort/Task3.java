package epam_intro_online.module_2.sort;

import java.util.Arrays;

// Сортировка выбором - Selection sort

public class Task3 {
    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 5, -6, 9, 10, 0, 12, 16, 0, 29, -30, 32, 0};
        System.out.println(Arrays.toString(sortSelectionDecrease(array)));
    }


    public static int[] sortSelectionDecrease(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int maxIndex = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(array, i, maxIndex);
        }

        return array;
    }

    private static void swap(int[] array, int index1, int index2) {
        int newValue = array[index1];
        array[index1] = array[index2];
        array[index2] = newValue;
    }

}
