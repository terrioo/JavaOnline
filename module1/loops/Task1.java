package epam_intro_online.module_1.loops;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(findSumma(number));

    }

    public static int findSumma(int number) {
        int summa = 0;
        if (number <= 0) {
            System.out.println("Number must be >0");
        }
        for (int i = 1; i <= number; i++) {
            summa += i;
        }
        return summa;
    }
}
