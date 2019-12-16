package epam_intro_online.module_2.sort;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29};
        int[] array2 = {4, 12, 18, 22, 26, 28};
        System.out.println(Arrays.deepToString(findIndex(array1, array2)));
    }
    public static int[][] findIndex(int[] array1, int[] array2) {
        int index = 0;
        int[][] array2InsertIndex = new int[array2.length][2];
        for (int i = 0; i < array2.length; i++) {
            index = binarySearch(array1, array2[i], index);
            array2InsertIndex[i][0] = array2[i];
            array2InsertIndex[i][1] = index;
        }

        return array2InsertIndex;
    }

    private static int binarySearch(int[] array1, int element, int startIndex) {
        int endIndex = array1.length - 1;
        while (startIndex <= endIndex) {

            int middleIndex = (startIndex + endIndex) / 2;
            if (array1[middleIndex] < element)
                startIndex = middleIndex + 1;
            else
                endIndex = middleIndex - 1;
        }
        return startIndex;
    }
}
