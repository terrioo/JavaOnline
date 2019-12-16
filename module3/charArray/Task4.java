package epam_intro_online.module_3.charArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        String string = "New3 0,55 word 466 and 5 new 445 22,686 word  657 3 new5";  // 9
        System.out.println(countNumbers(string));
    }

    public static int countNumbers(String string) {
        char[] chars = string.toCharArray();
        int сount = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                сount++;
                i++;

                while ((chars.length > i) && (Character.isDigit(chars[i]) || (chars[i] == '.' || chars[i] == ',')))
                    i++;
            }
        }
        return сount;
    }

}




/* - изначальное решение


 public static void main(String[] args) {
        String string = "New3 55 word 466 and 5 new 445 22 686 word  657 3 new5";  // 10
        System.out.println(countNumbers(string));
    }

    public static int countNumbers(String string) {
        int count = 0;
        String[] number = string.split("\\D");
        for (int i = 0; i < number.length; i++) {
            if (number[i].length() > 0) {
                count++;
            }
        }
        return count;
    }


 */