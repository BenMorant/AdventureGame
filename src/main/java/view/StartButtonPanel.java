package view;

import java.awt.event.ActionListener;

public class StartButtonPanel extends GamePanel {

    private GameButton startButton = new GameButton("C'EST PARTI !");

    public StartButtonPanel() {
        super(500, 600, 250, 120);
        add(startButton);
    }

    public void addStartButtonListener(ActionListener screenHandler, String actionCommand) {
        startButton.addActionListener(screenHandler);
        startButton.setActionCommand(actionCommand);
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
