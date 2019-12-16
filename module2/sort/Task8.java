package epam_intro_online.module_2.sort;

import java.util.*;

public class Task8 {

    public static void main(String[] args) {
        int[] numerator = {1, 9, 5, 23, 3, 14};
        int[] denominator = {2, 4, 5, 4, 6, 2};
        int commonDenominator = findCommonDenominator(denominator);
        System.out.println(commonDenominator);
        System.out.println(Arrays.toString(createNewArray(numerator, denominator, commonDenominator)));

    }

    public static int findCommonDenominator(int[] denominator) {
        int commonDenominator = 1;
        Set<Integer> setOfDenominators = new HashSet<>();
        for (int i = 0; i < denominator.length; i++) {
            setOfDenominators.add(denominator[i]);
        }
        List<Integer> listOfDenominators = new ArrayList<>();
        for (Integer set : setOfDenominators) {
            listOfDenominators.add(set);
        }

        for (int i = 0; i < listOfDenominators.size(); i++) {
            commonDenominator *= listOfDenominators.get(i);
        }
        return commonDenominator;
    }

    public static double[] createNewArray(int[] numerator, int[] denominator, int commonDenominator) {
        double[] newArray = new double[numerator.length];
        for (int i = 0; i < newArray.length; i++) {
            int factor = commonDenominator/denominator[i];
            newArray[i] = (double) numerator[i] * factor / commonDenominator;
        }
        Arrays.sort(newArray);
        return newArray;
    }

}
