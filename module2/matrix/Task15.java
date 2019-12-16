package epam_intro_online.module_2.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task15 {
    public static void main(String[] args) {
        int[][] matrix = fillMatrix(4, 4);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(changeMatrix(matrix)));
    }

    public static int[][] fillMatrix(int sizeM, int sizeN) {
        int[][] matrix = new int[sizeM][sizeN];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    public static int[][] changeMatrix(int[][] matrix) {
        int maxValue = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = maxValue;
                }
            }
        }
        return matrix;
    }
}
