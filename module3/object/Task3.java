package epam_intro_online.module_3.object;

public class Task3 {
    public static void main(String[] args) {
        String word = "Kazak";
        System.out.println("The word is palindrome: " + isPalindrome(word));
    }

    public static boolean isPalindrome(String str) {
        StringBuilder word = new StringBuilder(str.toLowerCase());
        word.reverse();
        return word.toString().equals(str.toLowerCase());
    }
}
