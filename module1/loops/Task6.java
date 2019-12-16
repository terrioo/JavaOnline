package epam_intro_online.module_1.loops;

public class Task6 {
    public static void main(String[] args) {
        printChar();
    }

    public static void printChar() {
        for (int i = 1; i <= 255; i++) {
            System.out.println((char)i+" "+i);
        }
    }
}


