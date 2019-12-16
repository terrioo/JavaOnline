package epam_intro_online.module_2.decomposition;

public class Task2 {
    public static void main(String[] args) {
        int nod = findNod(18, 78, 36, 24);
        System.out.println(nod);
    }

    public static int findNod(int number1, int number2, int number3, int number4) {
        int nod = 1;
        int minimum = Math.min(Math.min(number1, number2), Math.min(number3, number4));
        for (int i = 1; i <minimum; i++) {
            if (number1 % i == 0 && number2 % i == 0 && number3 % i == 0 && number4 % i == 0) {
                nod = i;
            }
        }
        return nod;
    }
}
