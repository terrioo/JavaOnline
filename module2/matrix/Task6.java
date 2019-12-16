package epam_intro_online.module_2.matrix;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[][] matrix = fillMatrix(6);
        System.out.println(Arrays.deepToString(matrix));

    }

    public static int[][] fillMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {

            if (i < matrix.length / 2) {
                for (int j = i; j < matrix.length - i; j++) {
                    matrix[i][j] = 1;
                }
            } else {
                for (int j = matrix.length - i - 1; j < i + 1; j++) {
                    matrix[i][j] = 1;
                }
            }

        }
        return matrix;
    }
}

