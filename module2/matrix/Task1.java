package epam_intro_online.module_2.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        int[][] matrix = fillMatrix(5, 4);
        System.out.println(Arrays.deepToString(matrix));
        Integer[] numberOfColumns = findOddColumns(matrix);
        System.out.println("№ of columns of matrix are " + Arrays.toString(numberOfColumns));
        printColumns(matrix, numberOfColumns);

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


    public static Integer[] findOddColumns(int[][] matrix) {
        ArrayList<Integer> listOfColumns = new ArrayList<>();
        for (int i = 1; i < matrix[0].length; i += 2) {
            if (matrix[0][i] > matrix[matrix.length - 1][i]) {
                listOfColumns.add(i);
            }

        }
        Integer[] number = listOfColumns.toArray(new Integer[listOfColumns.size()]);
        return number;
    }

    public static void printColumns(int[][] matrix, Integer[] numberOfColumns) {
        for (int k = 0; k < numberOfColumns.length; k++) {
            int i = numberOfColumns[k];
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
