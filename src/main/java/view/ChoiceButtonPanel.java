package view;

import java.awt.*;

public class ChoiceButtonPanel extends GamePanel {
    private final GameButton choice1;
    private final GameButton choice2;
    private final GameButton choice3;
    private final GameButton choice4;

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
}
