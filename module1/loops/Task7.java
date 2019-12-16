package epam_intro_online.module_1.loops;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        findDivisor(m, n);

    }

    public static void findDivisor(int m, int n) {
        int count=0;
        if (m >= n) {
            System.out.println("Number m must be more than number n");
        }
        while (m < n) {
            m++;
            System.out.println("Divisors of number " + m + ": ");
            count=0;
            for (int i = 2; i < m; i++) {

                if (m % i == 0) {
                    System.out.println(i);
                    count++;
                }
            }
            if (count==0){
                System.out.println("This number doesn't have any divisor");
            }
        }
    }
}

