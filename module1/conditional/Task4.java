package epam_intro_online.module_1.conditional;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("The brick will go through the hole: " + checkBrick(30, 20, 12, 46, 22));
    }

    public static boolean checkBrick(int a, int b, int x, int y, int z) {
        boolean result = false;
        if ((a >= x && b >= y) || (a >= y && b >= x) || (a >= x && b >= z) || (a >= z && b >= x)
                || (a >= y && b >= z) || (a >= z && b >= y)) {
            result = true;
        }
        return result;
    }
}


