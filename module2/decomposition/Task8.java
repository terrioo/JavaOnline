package epam_intro_online.module_2.decomposition;

public class Task8 {
    public static void main(String[] args) {
        int[] array = {-1, 2, -3, 5, -6, 9, 10, 0, 12, 16, 0, 29, -30, 32, 0};
        System.out.println(findSumma(array, 4));
    }

    public static int findSumma(int[] array, int index) {
        int summa = 0;
        if (index + 3 > array.length) {
            System.out.println("Incorrect data. The operation is impossible");
        } else {
            for (int i = index; i <= index + 3; i++) {
                summa += array[i];
            }
        }
        return summa;
    }
}
