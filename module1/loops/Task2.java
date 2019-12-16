package epam_intro_online.module_1.loops;

public class Task2 {
    public static void main(String[] args) {
        findFunction(-10, 18, 2);
    }

    public static void findFunction(int begin_A, int end_B, int step_H) {
        for (int i = begin_A; i <= end_B; i += step_H) {
            System.out.println(i > 2 ? i : -i);
        }
    }
}
