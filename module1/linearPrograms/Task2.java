package epam_intro_online.module_1.linearPrograms;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(math(2, 6, 3));
    }

    public static double math(double a, double b, double c) {
        return (b + Math.sqrt((Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c + Math.pow(b, -2));
    }
}
