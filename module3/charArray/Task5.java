package epam_intro_online.module_3.charArray;

public class Task5 {
    public static void main(String[] args) {
        String string = "Удалить    в строке   все   лишние пробелы  ";
        System.out.println(deleteSpaces(string));
    }

    public static String deleteSpaces(String string) {
        String newString = string.trim();
        newString = newString.replaceAll("\\s+", " ");
        return newString;
    }
}
