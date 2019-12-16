package epam_intro_online.module_4.AgregationAndCommposition.Task1_Text;

public class Main {
    public static void main(String[] args) {
        Word word1 = new Word("Day");
        Word word2 = new Word("What");
        Word word3 = new Word("a");
        Word word4 = new Word("wonderful");
        Word word5 = new Word("day");


        Sentence sentence1 = new Sentence();
        sentence1.addText(word1);
        Sentence sentence2 = new Sentence();
        sentence2.addText(word2);
        sentence2.addText(word3);
        sentence2.addText(word4);
        sentence2.addText(word5);

        Text text = new Text(sentence1);
        text.addText(sentence2);
        text.printTitle(text);
        text.printText(text);

    }
}
