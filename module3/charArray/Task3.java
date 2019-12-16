package epam_intro_online.module_3.charArray;

public class Task3 {
    public static void main(String[] args) {
        String string = "hf42vbdfj 3243489fb39r bg49bf3920bf v2309bf df2s v02";  //24
        System.out.println("Count of numbers in the line is " + countNumbers(string));
    }

    public static int countNumbers(String string) {
        int count = 0;
        char[] symbols = string.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] >= 48 && symbols[i] <= 57) {
                count++;
            }
        }
        return count;
    }
}
