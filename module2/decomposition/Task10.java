package epam_intro_online.module_2.decomposition;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fillArray(68376836)));
    }

    public static char[] fillArray(int number) {
        String string = number + "";
        char[] numberArray = string.toCharArray();
        return numberArray;
    }
}
