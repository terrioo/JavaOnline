package epam_intro_online.module_2.sort;

//  Сортировка обменами - сортировка пузырьком - Bubble sort

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 5, -6, 9, 10, 0, 12, 16, 14, 29, -30, 32, 46};
        System.out.println(Arrays.toString(sortBubbleIncrease(array)));
    }

    public static int[] sortBubbleIncrease(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; ++i) {
            for (int j = 0; j < array.length - i; ++j) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    count++;
                }
            }
        }
        System.out.println("Количество перестановок - " + count);
        return array;
    }


    private static void swap(int[] array, int index1, int index2) {
        int newValue = array[index1];
        array[index1] = array[index2];
        array[index2] = newValue;
    }
}
