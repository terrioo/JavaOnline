package epam_intro_online.module_2.matrix;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        int[][] matrix = createMagicSquare(3);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static int[][] createMagicSquare(int size) {
        int[][] matrix = new int[size][size];
        int maxValue = (int) Math.pow(size, 2);

        for (int i = 1, j = 0, k = matrix.length / 2; i <= maxValue; i++, j--, k++) {
            if (j >= 0 && k < matrix.length) {
                if (matrix[j][k] == 0) {
                    matrix[j][k] = i;
                } else {
                    j += 2;
                    k--;
                    matrix[j][k] = i;
                }
            } else if (j < 0 && k < matrix.length) {
                j = matrix.length - 1;
                if (matrix[j][k] == 0) {
                    matrix[j][k] = i;
                }
            } else if (j < 0 && k >= matrix.length) {
                j += 2;
                k--;
                matrix[j][k] = i;
            } else if (k >= matrix.length && j >= 0) {
                k = 0;
                if (matrix[j][k] == 0) {
                    matrix[j][k] = i;
                } else {
                    j += 2;
                    k--;
                    matrix[j][k] = i;
                }
            }
        }
        return matrix;
    }
}




