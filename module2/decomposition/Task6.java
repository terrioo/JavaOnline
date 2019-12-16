package epam_intro_online.module_2.decomposition;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("The numbers are coprime - " + checkSimple(18, 91, 17));
        System.out.println("The numbers are coprime - " + checkSimple(18, 78, 36));
    }

    public static boolean checkSimple(int number1, int number2, int number3) {
        int nod = 1;
        boolean check = false;
        int minimum = Math.min(Math.min(number1, number2), number3);
        for (int i = 1; i < minimum; i++) {
            if (number1 % i == 0 && number2 % i == 0 && number3 % i == 0) {
                nod = i;
            }
        }
        if (nod == 1) {
            check = true;
        }
        return check;
    }
}
