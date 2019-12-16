package epam_intro_online.module_2.sort;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29};
        int[] array2 = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
        System.out.println(Arrays.toString(copyArrays(array1, array2)));
    }

    public static int[] copyArrays(int[] array1, int[] array2) {
        int length = array1.length;
        array1 = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, array1, length, array2.length);
        Arrays.sort(array1);
        return array1;
    }
}
