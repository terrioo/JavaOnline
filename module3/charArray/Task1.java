package epam_intro_online.module_3.charArray;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[] arrayOfTitles = {"camelCaseOne", "camelCaseTwo", "camelCaseThree", "camelCaseOneNew"};
        convertToSnakeCase(arrayOfTitles);
        print(arrayOfTitles);


    }

    public static String[] convertToSnakeCase(String[] array) {

        StringBuilder line = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                char currentChar = array[i].charAt(j);
                if (Character.isLowerCase(currentChar)) {
                    line.append(currentChar);
                } else {
                    line.append("_");
                    line.append(String.valueOf(currentChar).toLowerCase());
                }
            }
            array[i] = line.toString();
            line.setLength(0);
        }
        return array;
    }

    public static void print(String[] array) {
        System.out.println(Arrays.toString(array));
    }
}