package epam_intro_online.module_3.regularExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Дана строка содержащая xml-док. Написать анализатор позволяющий последовательно возвращать
 * содержимое узлов xml-документа и его тип(открывающий тег, закрывающий тег, содержимое тега,
 * тег без тела).
 */


public class Task2 {
    private static final String OPEN_TAG = "<[a-zA-Z]+(\\\\s[a-z]+\\\\s=\\\\s\\\"?[a-zA-Z0-9]+\\\"?)?>";
    private static final String CLOSE_TAG = "(<\\\\.*>)";
    private static final String EMPTY_TAG = "<.+/>";
    private static final String CONTENT = ">.+<";

    public static void main(String[] args) {
        String xml = "<notes>\n" +
                "<note id = 1>\n" +
                "<to>Вася<\\to>\n" +
                "<from>Света<\\from>\n" +
                "<heading>Напоминание<\\heading>\n" +
                "<body>Позвони мне завтра<\\body>\n" +
                "<\\note>\n" +
                "<note id = 2>\n" +
                "<to>Петя<\\to>\n" +
                "<from>Маша<\\from>\n" +
                "<heading>Важное напоминание<\\heading>\n" +
                "<body/>" + "\n" +
                "<\\note>\n" +
                "<\\notes>";
        List<String> info = parseXml(xml);
        for (String parser : info) {
            System.out.println(parser);
        }
    }


    public static List<String> parseXml(String xml) {
        List<String> parseList = new ArrayList<>();
        String[] nodes = xml.split("\n");
        Pattern pattern1 = Pattern.compile(OPEN_TAG);
        Pattern pattern2 = Pattern.compile(CLOSE_TAG);
        Pattern pattern3 = Pattern.compile(EMPTY_TAG);
        Pattern pattern4 = Pattern.compile(CONTENT);
        for (String tag : nodes) {
            Matcher matcher1 = pattern1.matcher(tag);
            Matcher matcher2 = pattern2.matcher(tag);
            Matcher matcher3 = pattern3.matcher(tag);
            Matcher matcher4 = pattern4.matcher(tag);

            if (matcher3.find()) {
                parseList.add("empty tag: " + matcher3.group());
            }
            if (matcher1.find()) {
                parseList.add("opening tag: " + matcher1.group());
            }
            if (matcher4.find()) {
                parseList.add("content: " + tag.substring(matcher4.start() + 1,
                        matcher4.end() - 1));
            }
            if (matcher2.find()) {
                parseList.add("closing tag: " + matcher2.group());
            }
        }
        return parseList;
    }
}




 /*
     private static final String OPEN_TAG = "<[^/].[^/]*?>"; или   "<[a-zA-Z]+(\\s[a-z]+\\s=\\s\"?[a-zA-Z0-9]+\"?)?>";
    private static final String CLOSE_TAG = "</\\w+>";
    private static final String EMPTY_TAG = "<\\w+/>";
    private static final String CONTENT_TAG = ">.+<";

     */



















