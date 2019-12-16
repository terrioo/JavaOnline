package epam_intro_online.module_3.regularExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String text = "Регулярные выражения представляют мощный инструмент для обработки строк. Регулярные выражения " +
                "позволяют задать шаблон, которому должна соответствовать строка или подстрока.\n" +
                "Некоторые методы класса String принимают регулярные выражения и используют их для выполнения " +
                "операций над строками.\n" +
                "Для разделения строки на подстроки применяется метод split(). В качестве параметра он может " +
                "принимать регулярное выражение, которое представляет критерий разделения строки. Например, разделим" +
                " предложение на слова.";

        // текст, отсортированный по длине параграфов
        String[] sortParagraphs = sortParagraphs(text);
        for (String array : sortParagraphs) {
            System.out.println(array);
        }

        System.out.println();

        // текст, где в предложениях отсортированы слова по возрастанию
        List<String> listOfWords = sortWords(text);
        for (String list : listOfWords) {
            System.out.println(list);
        }
        System.out.println();


        // текст, где в предложениях отсортированы слова по количеству вхождений символа
        List<String> listOfWordsWithChar = sortBySymbol(text, 'р');
        for (String list : listOfWordsWithChar) {
            System.out.println(list);
        }
    }

    // сортируем параграфы в тексте по количеству предложений
    public static String[] sortParagraphs(String text) {
        Pattern pattern = Pattern.compile("\\n");
        //  Matcher matcher = pattern.matcher(text);
        String[] paragraph = pattern.split(text);
        for (int i = 0; i < paragraph.length - 1; i++) {
            for (int j = 0; j < paragraph.length - 1 - i; j++) {
                int NumberOfSentences1 = getNumberOfSentences(paragraph[j]);
                int NumberOfSentences2 = getNumberOfSentences(paragraph[j + 1]);
                if (NumberOfSentences1 > NumberOfSentences2) {
                    String temp = paragraph[j];
                    paragraph[j] = paragraph[j + 1];
                    paragraph[j + 1] = temp;
                }

            }
        }
        return paragraph;
    }

    //считаем количество предложений в параграфе
    public static int getNumberOfSentences(String string) {
        Pattern pattern = Pattern.compile("(\\.|\\?|!)");
        Matcher matcher = pattern.matcher(string);
        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }


    // сортируем слова в предложениях по возрастанию
    public static List<String> sortWords(String text) {
        Pattern pattern = Pattern.compile("(\\.|\\?|!)");
        //    Matcher matcher = pattern.matcher(text);

        List<String> listOfWords = new ArrayList<>();
        String[] sentence = pattern.split(text);
        String[] word;
        String temp;
        for (int i = 0; i < sentence.length; i++) {
            StringBuilder string = new StringBuilder();
            word = sentence[i].split(",*\\s+");
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < word.length - 1; j++) {
                    if (word[j].length() > word[j + 1].length()) {
                        isSorted = false;
                        temp = word[j];
                        word[j] = word[j + 1];
                        word[j + 1] = temp;
                    }
                }
            }

            for (int k = 0; k < word.length; k++) {
                string.append(word[k] + " ");
            }
            listOfWords.add(string.toString());
        }
        return listOfWords;
    }


    public static void sortAlphabet(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[j].toLowerCase().compareTo(words[i].toLowerCase()) > 0) {
                    String tmp = words[j];
                    words[j] = words[i];
                    words[i] = tmp;
                }
            }
        }

    }

    public static int findNumberOfChar(String string, char symbol) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if ((string.toLowerCase().charAt(i) == symbol)) {
                count++;
            }
        }
        return count;
    }


    // сортируем предложения по количеству вхождений символа в предложение
    public static List<String> sortBySymbol(String text, char symbol) {
        Pattern pattern = Pattern.compile("(\\.|\\?|!)");
        //Matcher matcher = pattern.matcher(text);

        List<String> listOfWords = new ArrayList<>();
        String[] sentence = pattern.split(text);
        String[] words;
        for (int h = 0; h < sentence.length; h++) {
            StringBuilder string = new StringBuilder();
            words = sentence[h].split(",*\\s+");
            for (int i = 0; i < words.length - 1; i++) {
                for (int j = 0; j < words.length - 1 - i; j++) {
                    int word1 = findNumberOfChar(words[j], symbol);
                    int word2 = findNumberOfChar(words[j + 1], symbol);
                    if (word1 == word2) {
                        String[] arr = {words[j], words[j + 1]};
                        sortAlphabet(arr);
                        for (int k = 0; k < arr.length; k++) {
                            words[j] = arr[0];
                            words[j + 1] = arr[1];
                        }
                    }

                    if (word1 < word2) {
                        String temp = words[j];
                        words[j] = words[j + 1];
                        words[j + 1] = temp;
                    }

                }
            }
            for (int j = 0; j < words.length; j++) {
                string.append(words[j] + " ");
            }
            listOfWords.add(string.toString());
        }
        return listOfWords;

    }
}




/*
public static String[] sortWords(String text) {
        Pattern pattern = Pattern.compile("(\\.|\\?|!)");
        Matcher matcher = pattern.matcher(text);
        String[] sentence = pattern.split(text);
        List<String> listOfWords = new ArrayList<>();

        for (int i = 0; i < sentence.length; i++) {
            String[] word = sentence[i].split(",*\\s+");  //"[,]+\\s*"
            StringBuilder string = new StringBuilder();
            for (int j = 0; i < word.length - 1; i++) {
                if (word[j].length() > word[j + 1].length()) {
                    String temp = word[j];
                    word[j] = word[j + 1];
                    word[j + 1] = temp;
                }
                string.append(word[j] + " ");
            }
            listOfWords.add(string.toString());
        }
        int lengthOfArraySentence = sentence.length;
        String[] newSentence = new String[lengthOfArraySentence];
        for (int i = 0; i < newSentence.length; i++) {
            for (int j = 0; j < listOfWords.size(); i++) {
                newSentence[i] = listOfWords.get(j);
            }
        }
        return newSentence;
    }










 public static String[] sortWords(String text) {
        Pattern pattern = Pattern.compile("(\\.|\\?|!)");
        Matcher matcher = pattern.matcher(text);
        String[] sentence = pattern.split(text);
        int lengthOfArraySentence = sentence.length;
        String[] newSentence = new String[lengthOfArraySentence];
        List<String> listOfWords = new ArrayList<>();

        for (int i = 0; i < sentence.length; i++) {
            String[] word = sentence[i].split(",*\\s+");  //"[,]+\\s*"
            StringBuilder string = new StringBuilder();
            for (int j = 0; i < word.length - 1; i++) {
                if (word[j].length() > word[j + 1].length()) {
                    String temp = word[j];
                    word[j] = word[j + 1];
                    word[j + 1] = temp;
                }
                string.append(word[j] + " ");
            }
            for (int k = 0; k < newSentence.length; k++) {
                newSentence[k] = string.toString();
            }
        }
        return newSentence;
    }







public static void sortAlphabet(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[j].toLowerCase().compareTo(words[i].toLowerCase()) > 0) {
                    String tmp = words[j];
                    words[j] = words[i];
                    words[i] = tmp;
                }
            }
        }

    }

    public static int calculateNumberOfChar(String string, char symbol) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if ((string.toLowerCase().charAt(i) == symbol)) {
                count++;
            }
        }
        return count;
    }


    public static String[] sortBySymbol(String text, char symbol) {
        Pattern pattern = Pattern.compile("\\p{Punct}|\\s+");
        Matcher matcher = pattern.matcher(text);
        String[] words = pattern.split(text);

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                int curr = calculateNumberOfChar(words[j], symbol);
                int curr_1 = calculateNumberOfChar(words[j + 1], symbol);
                if (curr == curr_1) {
                    String[] arr = {words[j], words[j + 1]};
                    sortAlphabet(arr);
                    for (int k = 0; k < arr.length; k++) {
                        words[j] = arr[0];
                        words[j + 1] = arr[1];
                    }
                }

                if (curr < curr_1) {
                    String tmp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tmp;
                }

            }
        }
        return words;
    }




/////////////////////////////////////////////////////////////


    public static void sortAlphabet(String[] words) {
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[j].toLowerCase().compareTo(words[i].toLowerCase()) > 0) {
                    String tmp = words[j];
                    words[j] = words[i];
                    words[i] = tmp;
                }
            }
        }

    }

    public static int calculateNumberOfChar(String string, char symbol) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if ((string.toLowerCase().charAt(i) == symbol)) {
                count++;
            }
        }
        return count;
    }


    public static List<String> sortBySymbol(String text, char symbol) {
        Pattern pattern = Pattern.compile("(\\.|\\?|!)");
        Matcher matcher = pattern.matcher(text);

        List<String> listOfWords = new ArrayList<>();
        String[] sentence = pattern.split(text);
        String[] words;
        String temp;
        for (int i = 0; i < sentence.length; i++) {
            StringBuilder string = new StringBuilder();
            words = sentence[i].split(",*\\s+");
            for (int j = 0; j < words.length - 1; j++) {
                for (int k = 0; k < words.length - 1 - k; k++) {
                    int counOfCharInWird1 = calculateNumberOfChar(words[k], symbol);
                    int counOfCharInWird2 = calculateNumberOfChar(words[k + 1], symbol);
                    if (counOfCharInWird1 == counOfCharInWird2) {
                        String[] arr = {words[k], words[k + 1]};
                        sortAlphabet(arr);
                        for (int l = 0; l < arr.length; l++) {
                            words[k] = arr[0];
                            words[k + 1] = arr[1];
                        }
                    }

                    if (counOfCharInWird1 < counOfCharInWird2) {
                        String tmp = words[k];
                        words[k] = words[k + 1];
                        words[k + 1] = tmp;
                    }

                }
            }
            for (int j = 0; j < words.length; j++) {
                string.append(words[j].trim() + " ");
            }
            listOfWords.add(string.toString());
        }
        return listOfWords;
    }




 */