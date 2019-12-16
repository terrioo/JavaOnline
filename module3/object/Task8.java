package epam_intro_online.module_3.object;

public class Task8 {
    public static void main(String[] args) {
        String string = "Java, array, pattern";
        System.out.println(findLongestWord(string));
    }

    public static String findLongestWord(String string) {
        String[] word = string.split(" ");
        int max = word[0].length();
        String maxWord = "";
        for (int i = 1; i < word.length; i++) {
            if (word[i].length() > max) {
                max = word[i].length();
            }
        }
        for (int i = 1; i < word.length; i++) {
            if (word[i].length() == max) {
                maxWord = word[i];
            }
        }
        return maxWord;
    }
}
