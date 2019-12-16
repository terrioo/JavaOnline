package epam_intro_online.module_2.matrix;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = fillMatrix(4, 6);
        System.out.println(Arrays.deepToString(matrix));
        printColumns(matrix, 4);
        printStrings(matrix, 3);
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

    public static void printColumns(int[][] matrix, int p) {
        if (p <= matrix.length) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][p] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Incorrect data");
        }
    }


    public static void printStrings(int[][] matrix, int k) {
        if (k <= matrix.length) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[k][j] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Incorrect data");
        }

    }
}


