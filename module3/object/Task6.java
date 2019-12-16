package epam_intro_online.module_3.object;

public class Task6 {
    public static void main(String[] args) {
        String string = "Java, array, pattern";
        System.out.println(addNewChar(string));
    }


    public static String addNewChar(String string) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            newString.append(string.charAt(i));
            newString.append(string.charAt(i));
        }
        return newString.toString();
    }
}
