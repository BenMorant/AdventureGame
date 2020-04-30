package view.implementations;

import view.interfaces.TitleScreenInterface;

import javax.swing.*;
import java.awt.*;

public class TitleScreen extends JPanel implements TitleScreenInterface {

    private static final String START_BUTTON_TEXT = "C'est parti !";

    private JButton startButton;
    private JLabel titleLabel;

    public TitleScreen(String title) {
        super();
        displayTitle(title);
        displayStartButton(START_BUTTON_TEXT);
    }

    @Override
    public void displayTitle(String title) {
        this.titleLabel = new JLabel(title);
        this.add(titleLabel);

    }

    @Override
    public void displayStartButton(String startButtonText) {
        startButton = new JButton(startButtonText);
        this.add(startButton);

    }

    public JButton getStartButton() {
        return startButton;
    }

    public void setStartButton(JButton startButton) {
        this.startButton = startButton;
    }

    public JLabel getTitleLabel() {
        return titleLabel;
    }

    public void setTitleLabel(JLabel titleLabel) {
        this.titleLabel = titleLabel;
    }
}
