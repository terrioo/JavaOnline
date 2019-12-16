package epam_intro_online.module_1.conditional;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(math(6));
    }

    public static double math(double x) {
        return (x <= 3 ? Math.pow(x, 2) - 3 * x + 9 : 1 / (Math.pow(x, 3) + 6));
    }
}



