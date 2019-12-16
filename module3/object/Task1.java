package epam_intro_online.module_3.object;

public class Task1 {
    public static void main(String[] args) {
        String string = " Найти       наибольшее количество    подряд              идущих     пробелов  ";
        System.out.println("The length of max space is " + findMaxSpace(string));
    }

    public static int findMaxSpace(String string) {
        String[] arrayOfSpace = string.split("\\S+");
        int maxSpaceLength = arrayOfSpace[0].length();

        for (int i = 1; i < arrayOfSpace.length; i++) {
            if (arrayOfSpace[i].length() > maxSpaceLength) {
                maxSpaceLength = arrayOfSpace[i].length();
            }
        }
        return maxSpaceLength;
    }
}
