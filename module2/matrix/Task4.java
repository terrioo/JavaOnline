package epam_intro_online.module_2.matrix;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] matrix = fillMatrix(6);
        System.out.println(Arrays.deepToString(matrix));

    }

    public static int[][] fillMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = size - j;
                }

            }
        }
        return matrix;
    }
}
