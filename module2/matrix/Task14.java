package epam_intro_online.module_2.matrix;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        int[][] matrix = fillMatrix(5, 4);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static int[][] fillMatrix(int sizeM, int sizeN) {
        int[][] matrix = new int[sizeM][sizeN];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }
}