package epam_intro_online.module_2.matrix;

import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        int[][] matrix = fillMatrix(4, 4);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(sortColumnsIncrease(matrix)));
        System.out.println(Arrays.deepToString(sortColumnsDecrease(matrix)));
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

    public static int[][] sortColumnsIncrease(int[][] matrix) {
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int k = i + 1; k < matrix.length; k++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[k][j] < matrix[i][j]) {
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[k][j];
                        matrix[k][j] = temp;
                    }
                }
            }
        }
        return matrix;
    }

    public static int[][] sortColumnsDecrease(int[][] matrix) {
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int k = i + 1; k < matrix.length; k++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[k][j] > matrix[i][j]) {
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[k][j];
                        matrix[k][j] = temp;
                    }
                }
            }
        }
        return matrix;
    }
}

