package epam_intro_online.module_2.sort;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = {-1, 2, -3, 5, -6, 9, 10, 0, 12, 16, 0, 29, -30, 32, 0};
        int[] array2 = {12, 11, 10, 9, 8, 6, 5, 4, 3, 2};
        int k = 4;
        if (k <= array1.length) {
            System.out.println(Arrays.toString(copyArrays(array1, array2, k)));
        } else {
            System.out.println("Number k must be < length of array №1");
        }
    }


    public static int[] copyArrays(int[] array1, int[] array2, int k) {
        array1 = Arrays.copyOf(array1, array1.length + array1.length);

        for (int i = array1.length - array2.length - 1; i >= k - 1; i--) {
            array1[array2.length + i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            array1[k + i - 1] = array2[i];
        }
        return array1;
    }
}

