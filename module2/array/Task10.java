package epam_intro_online.module_2.array;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {1, 4, -3, 5, -6, 9, 10, 1, 12, 4, 9, 29, 4, 32, 7};
        System.out.println(Arrays.toString(decreaseArray(array)));
    }

    public static int[] decreaseArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        return array;
    }
}