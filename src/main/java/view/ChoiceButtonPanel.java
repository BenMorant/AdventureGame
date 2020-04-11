package view;

import java.awt.*;

public class ChoiceButtonPanel extends GamePanel {
//    private GameButton choice1;
//    private GameButton choice2;
//    private GameButton choice3;
//    private GameButton choice4;

    private final GameButton[] choiceButtons;


    public ChoiceButtonPanel() {
        super(850, 650, 400, 200);
        setLayout(new GridLayout(4, 1));
        choiceButtons = new GameButton[4];
        for (int i = 0; i < choiceButtons.length; i++) {
            choiceButtons[i] = new GameButton("Choix " + (i + 1));
            add(choiceButtons[i]);
        }

    }

}
