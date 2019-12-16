package epam_intro_online.module_3.object;

public class Task9 {
    public static void main(String[] args) {
        String string = "Java, Array, Pattern, String, NEW, woRD";  // 9   - 20
        System.out.println("Count of uppercase letters is " + findBigLetter(string));
        System.out.println("Count of lowercase letters is " +findSmallLetter(string));
    }

    public static int findBigLetter(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
                count++;
            }
        }
        return count;
    }

    public static int findSmallLetter(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
                count++;
            }
        }
        return count;
    }


}
