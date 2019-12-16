package epam_intro_online.module_1.linearPrograms;

public class Task6 {
    public static void main(String[] args) {
        System.out.println(isBelong(-2, -1));
    }

    public static boolean isBelong(int x, int y) {
        boolean marker = false;
        if ((x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <= 0)) {
            marker = true;
        }
        return marker;
    }
}
