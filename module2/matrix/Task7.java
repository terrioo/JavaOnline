package epam_intro_online.module_2.matrix;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        double[][] matrix = fillMatrix(6);
        System.out.println(Arrays.deepToString(matrix));

    }

    public static double[][] fillMatrix(int size) {
        double[][] matrix = new double[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) + Math.pow(j, 2)) / size);
            }

        }
        return matrix;
    }
}

