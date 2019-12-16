package epam_intro_online.module_2.decomposition;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("More digits contain a number " + fillArray(3544, 235645));
    }

    public static int fillArray(int number1, int number2) {
        int number = number1;
        String stringNumber1 = number1 + "";
        String stringNumber2 = number2 + "";
        char[] numberArray1 = stringNumber1.toCharArray();
        char[] numberArray2 = stringNumber2.toCharArray();
        if (numberArray2.length > numberArray1.length) {
            number = number2;
        }
        return number;
    }
}
