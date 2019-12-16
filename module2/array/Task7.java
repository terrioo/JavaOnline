package epam_intro_online.module_2.array;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 9, 10, 11, 12, 16, 18, 29, 30, 32};
        int divider = 3;
        List<Integer> number = findNumbers(array);
        System.out.println(findMax(number));
    }

    public static List<Integer> findNumbers(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length / 2; i++) {
            list.add(array[i] + array[array.length - i - 1]);
        }
        return list;
    }

    public static int findMax(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }
}
