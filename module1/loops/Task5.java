package epam_intro_online.module_1.loops;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(findSumma(9, 1.2));

    }

    public static int findSumma(int number, double e) {
        int summa = 0;
        for (int i = 1; i < number; i++) {
            double a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));
            if (Math.abs(a) >= e) {
                summa += a;
            }
        }
        return summa;
    }
}

