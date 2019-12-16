package epam_intro_online.module_1.linearPrograms;

public class Task4 {
    public static void main(String[] args) {
        System.out.printf("%.3f", replaceNumbers(578.435));
    }

    public static double replaceNumbers(double number) {
        int firstPart = (int) number;
        double secondPart = number - firstPart;
        return secondPart * 1000.0 + firstPart / 1000.0;
    }
}
