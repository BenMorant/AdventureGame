package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public final class GUI {

    private final ActionListener choiceHandler;
    private final ActionListener titleScreenHandler;
    private Container container;
    TitleNamePanel titleNamePanel;
    StartButtonPanel startButtonPanel;
    HeroPanel heroPanel;
    ChoiceButtonPanel choiceButtonPanel;
    MainTextPanel mainTextPanel;
    //    ImagePanelHeroPicture imagePanelHeroPicture;
//    ImagePanelMain imagePanelMain;
    private JLabel currentHPLabel, currentWeaponLabel;
    private JTextArea mainTextArea;


    public GUI(ActionListener choiceHandler, ActionListener titleScreenHandler) {
        this.choiceHandler = choiceHandler;
        this.titleScreenHandler = titleScreenHandler;
    }

    public void initializeStartScreen() {
        Window window = new Window();
        titleNamePanel = new TitleNamePanel();
        startButtonPanel = new StartButtonPanel();
        startButtonPanel.getStartButton().addActionListener(titleScreenHandler);

        container = window.getContentPane();
        container.add(titleNamePanel);
        container.add(startButtonPanel);
        window.setVisible(true);
    }

    public void createGameScreen() {
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        heroPanel = new HeroPanel();
        mainTextPanel = new MainTextPanel();
        choiceButtonPanel = new ChoiceButtonPanel();
        for (int i = 0; i < choiceButtonPanel.getChoiceButtons().length; i++) {
            choiceButtonPanel.getChoiceButtons()[i].addActionListener(choiceHandler);
            choiceButtonPanel.getChoiceButtons()[i].setActionCommand("c" + (i + 1));
        }

        container.add(heroPanel);
        container.add(mainTextPanel);
        container.add(choiceButtonPanel);
    }

    public void updateCurrentHPLabel(int currentHP) {
        currentHPLabel.setText(Integer.toString(currentHP));
    }

    public void updateCurrentWeaponLabel(String weapon) {
        currentWeaponLabel.setText(weapon);
    }

    public void updateMainTextArea(String mainText) {
        mainTextArea.setText(mainText);
    }

    public void updateChoiceButtons(String choice1, String choice2, String choice3, String choice4) {
        choiceButtonPanel.getChoiceButtons()[0].setText(choice1);
        choiceButtonPanel.getChoiceButtons()[1].setText(choice2);
        choiceButtonPanel.getChoiceButtons()[2].setText(choice3);
        choiceButtonPanel.getChoiceButtons()[3].setText(choice4);
    }

    public void updateChoiceButtonsNoActions() {
        choiceButtonPanel.getChoiceButtons()[0].setText(">");
        choiceButtonPanel.getChoiceButtons()[1].setText("");
        choiceButtonPanel.getChoiceButtons()[2].setText("");
        choiceButtonPanel.getChoiceButtons()[3].setText("");
    }

    public void hideChoiceButtons() {
        for (GameButton choiceButton : choiceButtonPanel.getChoiceButtons()) {
            choiceButton.setText("");
            choiceButton.setVisible(false);
        }
    }

}
