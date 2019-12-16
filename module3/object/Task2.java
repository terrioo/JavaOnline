package epam_intro_online.module_3.object;


public class Task2 {
    public static void main(String[] args) {
        String string = "Java, array, pattern";
        System.out.println(addChar(string));
    }

    public static String addChar(String string) {
        return string.replaceAll("a","b");
    }
}

