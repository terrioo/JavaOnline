package epam_intro_online.module_2.array;

import java.util.ArrayList;
import java.util.List;

public class Task9 {

    public static void main(String[] args) {
        int[] array = {1, 4, -3, 5, -6, 9, 10, 1, 12, 4, 0, 29, 4, 32, 7};
            System.out.println(findNumber(array));
    }

    public static int findNumber(int[] array) {
        int maxRepeat = 0;
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;

                    if (count > maxRepeat) {
                        maxRepeat = count;
                        minNumber = array[i];
                    }
                }
            }
        }
        return minNumber;
    }
}