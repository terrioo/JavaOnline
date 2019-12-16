package epam_intro_online.module_3.charArray;

public class Task2 {
    public static void main(String[] args) {
        String string = "New word and new word";
        System.out.println(replaceWord(string));
    }


    public static String replaceWord(String string) {
        String newString = string.replaceAll("word", "letter");
        return newString;
    }
}