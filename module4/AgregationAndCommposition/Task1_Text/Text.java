package epam_intro_online.module_4.AgregationAndCommposition.Task1_Text;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> text;
    private Sentence title;

    public Text(Sentence title) {
        this.text = new ArrayList<>();
        this.title = title;
    }

    public Sentence getTitle() {
        return title;
    }

    public List<Sentence> getText() {
        return text;
    }

    public void setText(List<Sentence> text) {
        this.text = text;
    }

    public void setTitle(Sentence title) {
        this.title = title;
    }

    public void addText(Sentence sentence) {
        text.add(sentence);
    }

    public void printTitle(Text text) {
        System.out.println(text.getTitle());
    }

    public void printText(Text text) {
        for (Sentence sentence : text.getText()) {
            System.out.println(sentence.toString());
        }
    }


}
