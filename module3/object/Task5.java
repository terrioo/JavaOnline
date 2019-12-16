package epam_intro_online.module_3.object;

public class Task5 {
    public static void main(String[] args) {
        String string = "Java, array, pattern";
        System.out.println(findA(string));
    }

    public static int findA(String string) {
        return string.length() - string.replaceAll("a", "").length();
    }
}

