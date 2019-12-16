package epam_intro_online.module_2.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        int[] array = {7, 2, 3, 5, 6, 9, 10, 11, 1, 16, 18, 1, 30, 32};
        int divider = 3;
        System.out.println(Arrays.toString(createNewArray(array)));
    }

    public static Integer[] createNewArray(int[] array) {
        int minNumber = array[0];
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minNumber) {
                count++;
            }
            if (array[i] != minNumber) {
                list.add(array[i]);

            }
        }

        Integer[] newArray = list.toArray(new Integer[array.length - count]);

        return newArray;
    }
}

/*
listOfStrings = Arrays.asList(arrayOfStrings); - преобразование массива в ArrayList
https://javadevblog.com/kak-preobrazovat-massiv-v-arraylist-na-java.html  - преобразование массива в ArrayList
https://javadevblog.com/kak-konvertirovat-arraylist-v-massiv-na-java.html - преобразование ArrayList в массив
 arrayOfStrings = listOfStrings.toArray(new String[listOfStrings.size()]);
https://qna.habr.com/q/414286

 */