package epam_intro_online.module_4.ClassesAndObject;

public class Task1 {
    public static void main(String[] args) {
        int valume1, valume2;
        int summa = sum(5, 10);
        int maximum = findMax(5, 10);
        print(summa);
        print(maximum);
    }

    public static int sum(int valume1, int valume2) {
        return valume1 + valume2;
    }

    public static int findMax(int valume1, int valume2) {
        return Math.max(valume1, valume2);

    }

    public static void print(int result) {
        System.out.println(result);

    }

}

