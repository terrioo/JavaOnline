package epam_intro_online.module_1.conditional;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(findMaximum(22, 56, 63, 18));
    }

    public static int findMaximum(int a, int b, int c, int d) {
        int min1 = (a < b) ? a : b;
        int min2 = (c < d) ? c : d;
        return (min1 > min2) ? min1 : min2;
    }
}
