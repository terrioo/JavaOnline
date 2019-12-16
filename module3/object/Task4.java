package epam_intro_online.module_3.object;

public class Task4 {
    public static void main(String[] args) {
        String string = "информатика";
        System.out.println(createWord(string));
    }

    public static String createWord(String str) {
        char t = str.charAt(7);
        char o = str.charAt(3);
        char r = str.charAt(4);

        return "" + t + o + r + t;
    }
}

