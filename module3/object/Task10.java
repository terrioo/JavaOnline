package epam_intro_online.module_3.object;

public class Task10 {
    public static void main(String[] args) {
        String string = "Java! Array! Pattern? String. NEW word.";  // 5
        System.out.println("There are "+findSentence(string)+" sentences");
    }

    public static int findSentence(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 33 || string.charAt(i) == 46 || string.charAt(i) == 63 ) {
                count++;
            }
        }
        return count;
    }
}

// 33 - !  46 - .  63 - ?