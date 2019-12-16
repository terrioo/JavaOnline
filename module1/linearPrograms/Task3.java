package epam_intro_online.module_1.linearPrograms;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(math(2, 6));
    }

    public static double math(double x, double y) {
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
    }
}
