package epam_intro_online.module_2.matrix;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[][] matrix = fillMatrix(6);
        System.out.println(Arrays.deepToString(matrix));

    }

    public static int[][] fillMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length - i; j++) {
                matrix[i][j] = i + 1;
            }

        }
        return matrix;
    }
}

