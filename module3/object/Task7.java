package epam_intro_online.module_3.object;

public class Task7 {
    public static void main(String[] args) {
        String string = "Java, array, pattern";
        System.out.println(deleteChar(string));
    }

    public static String deleteChar(String string) {
        string = string.replaceAll(" ", "");
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < string.length(); ++i) {
            if (newString.indexOf(string.charAt(i) + "") == -1) {
                newString.append(string.charAt(i));
            }
        }
        return newString.toString();
    }
}

