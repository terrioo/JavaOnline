package epam_intro_online.module_2.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) throws IOException {
        int[][] matrix = fillMatrix(4, 6);
        System.out.println("Введите номера столбцов, которые следует поменять");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int column1 = Integer.parseInt(reader.readLine());
        int column2 = Integer.parseInt(reader.readLine());
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(changeMatrix(matrix, column1, column2)));
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

    public static int[][] changeMatrix(int[][] matrix, int column1, int column2) {
        if (column1 > matrix.length || column2 > matrix.length) {
            System.out.println("Данные неверны. Превышены размеры матрицы. Провести изменения в матрице невозможно");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                int temp = matrix[i][column1 - 1];
                matrix[i][column1 - 1] = matrix[i][column2 - 1];
                matrix[i][column2 - 1] = temp;
            }
        }
        return matrix;
    }
}
