package epam_intro_online.module_2.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 5, -6, 9, 10, 0, 12, 16, 0, 29, -30, 32, 0};
        List<Integer> list = findNumbers(array);
        for (Integer number : list) {
            System.out.println(number);
        }
    }

    public static List<Integer> findNumbers(int[] array) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                list.add(array[i]);
            }
        }
        return list;
    }
}
