package epam_intro_online.module_1.conditional;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("A B and C belong to one line: " + checkLine(6, 2, 8, 4, 4, 1));
    }

    public static boolean checkLine(int x1, int y1, int x2, int y2, int x3, int y3) {
        boolean result = false;
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            result = true;
        }

        return result;
    }
}
