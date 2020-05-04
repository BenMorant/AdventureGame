package view.implementations;

import javax.swing.*;
import java.awt.event.ActionListener;

public class StartButtonPanel extends JPanel {

    private static final String START_BUTTON_TEXT = "C'est parti !";
    private JButton startButton = new JButton();

    public StartButtonPanel() {
   //this.startButton = startButton;
        startButton.setText(START_BUTTON_TEXT);
      //  startButton.setVisible(true);

        add(startButton);
    }

    public void addStartButtonListener(ActionListener screenHandler, String actionCommand) {
        startButton.addActionListener(screenHandler);
        startButton.setActionCommand(actionCommand);
    }

    public JButton getStartButton() {
        return startButton;
    }

    public void setStartButton(JButton startButton) {
        this.startButton = startButton;
    }
}
