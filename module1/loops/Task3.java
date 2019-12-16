package epam_intro_online.module_1.loops;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(findSumma());
    }

    public static int findSumma() {
        int summa = 0;
        for (int i = 1; i <= 100; i++) {
            summa += Math.pow(i, 2);
        }
        return summa;
    }
}
