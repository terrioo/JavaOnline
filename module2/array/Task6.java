package epam_intro_online.module_2.array;

public class Task6 {
    public static void main(String[] args) {
        double[] array = {2.4, 2.7, 4.3, -6.7, -3.1, 5.3, 6.3, 9.6};
        System.out.println(summa(array));

    }

    public static double summa(double[] array) {
        double summa = 0;
        for (int i = 0; i < array.length; i++) {
            if (isSimple(i)) {
                summa += array[i];
            }
        }
        return summa;
    }

    private static boolean isSimple(int index) {
        boolean b = true;
        if (index < 2) {
            b = false;
        }
        for (int i = 2; i <= index / 2; i++) {
            if (index % i == 0) {
                b = false;
            }
        }
        return b;
    }
}
