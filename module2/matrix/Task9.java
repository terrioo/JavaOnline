package epam_intro_online.module_2.matrix;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[][] matrix = fillMatrix(4, 6);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("№ of column with maximum summa of elements is " + findColunm(matrix));
    }

    public static int[][] fillMatrix(int sizeM, int sizeN) {
        int[][] matrix = new int[sizeM][sizeN];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int number = (int) (Math.random() * 100);
                if (number % 2 == 0) {
                    matrix[i][j] = number;
                } else {
                    matrix[i][j] = number + 1;
                }
            }
        }
        return matrix;
    }

    public static int findColunm(int[][] matrix) {
        int[] summa = new int[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                summa[j] += matrix[i][j];
            }
        }

        int maxSumma = 0;
        int columnIndex = 0;

        for (int i = 0; i < summa.length; i++) {
            if (summa[i] > maxSumma) {
                maxSumma = summa[i];
                columnIndex = i;
            }
        }

        return columnIndex;
    }

}
