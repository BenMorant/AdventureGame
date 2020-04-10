package view;

import java.awt.*;

public class ChoiceButtonPanel extends GamePanel {
    private GameButton choice1;
    private GameButton choice2;
    private GameButton choice3;
    private GameButton choice4;

    public ChoiceButtonPanel() {
        super(850, 650, 400, 200);
        setLayout(new GridLayout(4, 1));
        choice1 = new GameButton("choix 1");
        choice2 = new GameButton("choix 2");
        choice3 = new GameButton("choix 3");
        choice4 = new GameButton("choix 4");
        createChoiceButtonPanel();
    }

    public void createChoiceButtonPanel() {
        buildChoiceButtonPanel();
        setVisible(true);
    }

    private void buildChoiceButtonPanel() {
        add(choice1);
        add(choice2);
        add(choice3);
        add(choice4);
    }

    public GameButton getChoice1() {
        return choice1;
    }

    public void setChoice1(GameButton choice1) {
        this.choice1 = choice1;
    }

    public GameButton getChoice2() {
        return choice2;
    }

    public void setChoice2(GameButton choice2) {
        this.choice2 = choice2;
    }

    public GameButton getChoice3() {
        return choice3;
    }

    public void setChoice3(GameButton choice3) {
        this.choice3 = choice3;
    }

    public GameButton getChoice4() {
        return choice4;
    }

    public void setChoice4(GameButton choice4) {
        this.choice4 = choice4;
    }

    @Override
    public String toString() {
        return "ChoiceButtonPanel{" +
                "choice1=" + choice1 +
                ", choice2=" + choice2 +
                ", choice3=" + choice3 +
                ", choice4=" + choice4 +
                ", ui=" + ui +
                ", listenerList=" + listenerList +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}
