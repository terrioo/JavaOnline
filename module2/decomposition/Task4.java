package epam_intro_online.module_2.decomposition;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] coordinate = {{3, 8}, {-4, 6}, {12, 28}, {0, -5}, {9, -2}, {7, 3}};
        System.out.println("The maximum distance between points is " + Arrays.toString(findMaxDistance(coordinate)));
    }

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

    }

    public static int[] findMaxDistance(int[][] coordinate) {
        double maxDistance = 0;
        double distance = 0;
        int[] point = new int[2];

        for (int i = 0; i < coordinate.length; i++) {
            for (int j = 1; j < coordinate.length; j++) {
                distance = calculateDistance(coordinate[i][0], coordinate[i][1], coordinate[j][0], coordinate[j][1]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    point[0] = i + 1;
                    point[1] = j + 1;
                }
            }
        }
        return point;
    }
}
