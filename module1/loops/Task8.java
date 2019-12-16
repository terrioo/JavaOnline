package epam_intro_online.module_1.loops;

import java.util.HashSet;
import java.util.Set;

public class Task8 {
    public static void main(String[] args) {
        findNumbers(547683, 44354682);
    }

    public static void findNumbers(int number1, int number2) {
        Integer numberFirst = number1;
        Integer numberSecond = number2;
        Set<Character> listOfNumbers = new HashSet<>();
        char[] arrayNumber1 = numberFirst.toString().toCharArray();
        char[] arrayNumber2 = numberSecond.toString().toCharArray();

        for (int i = 0; i < arrayNumber1.length; i++) {
            for (int j = 0; j < arrayNumber2.length; j++) {
                if (arrayNumber1[i] == arrayNumber2[j]) {
                    listOfNumbers.add(arrayNumber1[i]);
                }
            }
        }
        System.out.println("Common numbers of " + number1 + " and " + number2 + " are: ");
        for (Character set : listOfNumbers)
            System.out.print(set + " ");
    }
}

