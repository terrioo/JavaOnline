package epam_intro_online.module_2.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        int[][] matrix = fillMatrix(5, 5);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.toString(findElementsDiagonal(matrix)));
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

    public static Integer[] findElementsDiagonal(int[][] matrix) {
        List<Integer> elementsOfDiagonal = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j && i % 2 == 0) {
                    elementsOfDiagonal.add(matrix[i][j]);
                }
            }
        }
        Integer[] number = elementsOfDiagonal.toArray(new Integer[elementsOfDiagonal.size()]);
        return number;
    }
}
