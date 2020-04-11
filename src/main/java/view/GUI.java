package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public final class GUI {

    private final ActionListener choiceHandler;
    private final ActionListener titleScreenHandler;
    private final Font normalFont = new Font("Times New Roman", Font.PLAIN, 28);
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


    private JButton[] choiceButtons;

    public GUI(ActionListener choiceHandler, ActionListener titleScreenHandler) {
        this.choiceHandler = choiceHandler;
        this.titleScreenHandler = titleScreenHandler;
    }

    public void initializeStartScreen() {
        Window window = new Window();

        titleNamePanel = new TitleNamePanel();
        startButtonPanel = new StartButtonPanel();


        startButtonPanel.getStartButton().addActionListener(titleScreenHandler);

        // Add to Container
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
        
//        JPanel choiceButtonPanel = new JPanel();
//        choiceButtonPanel.setBounds(250, 350, 300, 150);
//        choiceButtonPanel.setBackground(Color.BLACK);
//        choiceButtonPanel.setLayout(new GridLayout(4, 1));
//
//        choiceButtons = new JButton[4];
//        for (int i = 0; i < choiceButtons.length; i++) {
//            choiceButtons[i] = new JButton("Choice " + (i + 1));
//            choiceButtons[i].setOpaque(true);
//            choiceButtons[i].setBorderPainted(false);
//            choiceButtons[i].setFocusPainted(false);
//            choiceButtons[i].setBackground(Color.BLACK);
//            choiceButtons[i].setForeground(Color.WHITE);
//            choiceButtons[i].setFont(normalFont);
//            choiceButtons[i].addActionListener(choiceHandler);
//            choiceButtons[i].setActionCommand("c" + (i + 1));
//
//            choiceButtonPanel.add(choiceButtons[i]);
//        }

        // Add to Container
        //  container.add(playerPanel);
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
        choiceButtons[0].setText(choice1);
        choiceButtons[1].setText(choice2);
        choiceButtons[2].setText(choice3);
        choiceButtons[3].setText(choice4);
    }

    public void updateChoiceButtonsNoActions() {
        choiceButtons[0].setText(">");
        choiceButtons[1].setText("");
        choiceButtons[2].setText("");
        choiceButtons[3].setText("");
    }

    public void hideChoiceButtons() {
        for (JButton choiceButton : choiceButtons) {
            choiceButton.setText("");
            choiceButton.setVisible(false);
        }
    }

}
