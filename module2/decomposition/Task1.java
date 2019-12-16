package epam_intro_online.module_2.decomposition;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        int nod = findNod(21, 98);
        System.out.println(nod);
        int nok = findNok(21, 98, nod);
        System.out.println(nok);
    }

    public static int findNod(int number1, int number2) {
        int nod = 1;
        for (int i = 1; i <(number1 > number2 ? number2 : number1); i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                nod = i;
            }
        }

        return nod;
    }


    public static int findNok(int number1, int number2, int nod) {
        return number1 * number2 / nod;
    }

}


