package epam_intro_online.module_2.decomposition;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("The sum of the factorials of odd numbers from 1 to 9 is " + findsSumOfFactorial());
    }

    public static int findsSumOfFactorial() {
        int summa = 0;
        for (int i = 1; i < 10; i += 2) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            summa += factorial;
        }
        return summa;
    }
}
