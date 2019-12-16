package epam_intro_online.module_2.array;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 5, -6, 9, 10, 0, 12, 16, 0, 29, -30, 32, 0};
        System.out.println("Count of positive numbers is " + findPositiveNumbers(array));
        System.out.println("Count of negative numbers is " + findNegativeNumbers(array));
        System.out.println("Count of zero is " + findZero(array));

    }

    public static int findPositiveNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static int findNegativeNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;
    }


    public static int findZero(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        return count;
    }
}
