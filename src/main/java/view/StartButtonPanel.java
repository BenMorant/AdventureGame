package view;

import java.awt.event.ActionListener;

public class StartButtonPanel extends GamePanel {

    private GameButton startButton = new GameButton("C'EST PARTI !");

    public StartButtonPanel(ActionListener choiceHandler) {
        super(500, 600, 250, 120);
        startButton.addActionListener(choiceHandler);
        startButton.setActionCommand("start");
        add(startButton);
    }

    public GameButton getStartButton() {
        return startButton;
    }

    public void setStartButton(GameButton startButton) {
        this.startButton = startButton;
    }

    @Override
    public String toString() {
        return "StartButtonPanel{" +
                "startButton=" + startButton +
                ", ui=" + ui +
                ", listenerList=" + listenerList +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}
