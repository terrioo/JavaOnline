package epam_intro_online.module_4.AgregationAndCommposition.Task1_Text;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> words;

    public Sentence() {
        this.words = new ArrayList<>();
    }

    public List<Word> getWords() {
        return words;
    }

    public void setWords(List<Word> words) {
        this.words = words;
    }

    public List<Word> addText(Word word) {
        words.add(word);
        return words;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Word word : words) {
            sb.append(word.toString() + " ");
        }

        return sb.toString();
    }

}

