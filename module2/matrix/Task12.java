package epam_intro_online.module_2.matrix;

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[][] matrix = fillMatrix(6, 6);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(sortStringsIncrease(matrix)));
        System.out.println(Arrays.deepToString(sortStringsDecrease(matrix)));
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

    public static int[][] sortStringsIncrease(int[][] matrix) {
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = j + 1; k < matrix[i].length; k++) {
                    if (matrix[i][k] < matrix[i][j]) {
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
        }
        return matrix;
    }

    public static int[][] sortStringsDecrease(int[][] matrix) {
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = j + 1; k < matrix[i].length; k++) {
                    if (matrix[i][k] > matrix[i][j]) {
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
        }
        return matrix;
    }
}

