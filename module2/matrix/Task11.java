package epam_intro_online.module_2.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        int[][] matrix = fillMatrix(10, 20);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.toString(findStrings(matrix)));
    }

    public static int[][] fillMatrix(int sizeM, int sizeN) {
        int[][] matrix = new int[sizeM][sizeN];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 16);
            }
        }
        return matrix;
    }

    public static Integer[] findStrings(int[][] matrix) {
        List<Integer> numberOfString = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int countFive = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    countFive++;
                }
            }
            if (countFive >= 3) {
                numberOfString.add(i);
            }
        }
        Integer[] number = numberOfString.toArray(new Integer[numberOfString.size()]);
        return number;
    }
}