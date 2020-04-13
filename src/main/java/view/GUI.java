package view;

import model.items.weapons.Weapon;

import java.awt.*;
import java.awt.event.ActionListener;

public final class GUI {

    private final ActionListener choiceHandler;
    Window window;
    private Container container;
    TitleNamePanel titleNamePanel;
    StartButtonPanel startButtonPanel;
    HeroPanel heroPanel;
    ChoiceButtonPanel choiceButtonPanel;
    MainTextPanel mainTextPanel;
    //    ImagePanelHeroPicture imagePanelHeroPicture;
//    ImagePanelMain imagePanelMain;
//    private JLabel currentHPLabel, currentWeaponLabel;
//    private JTextArea mainTextArea;

        public GUI(ActionListener choiceHandler) {
            this.choiceHandler = choiceHandler;
            window = new Window();
            titleNamePanel = new TitleNamePanel();
            startButtonPanel = new StartButtonPanel();
            startButtonPanel.getStartButton().addActionListener(choiceHandler);
            startButtonPanel.getStartButton().setActionCommand("start");
            heroPanel = new HeroPanel();
            mainTextPanel = new MainTextPanel();
            choiceButtonPanel = new ChoiceButtonPanel();
            for (int i = 0; i < choiceButtonPanel.getChoiceButtons().length; i++) {
                choiceButtonPanel.getChoiceButtons()[i].addActionListener(choiceHandler);
                choiceButtonPanel.getChoiceButtons()[i].setActionCommand("c" + (i + 1));
            }
            addPanels();
            window.setVisible(true);
        }

    public void addPanels() {
        container = window.getContentPane();
        container.add(titleNamePanel);
        container.add(startButtonPanel);
        container.add(heroPanel);
        container.add(mainTextPanel);
        container.add(choiceButtonPanel);
    }

    public void showTitleScreen() {
        titleNamePanel.setVisible(true);
        startButtonPanel.setVisible(true);
        heroPanel.setVisible(false);
        mainTextPanel.setVisible(false);
        choiceButtonPanel.setVisible(false);
    }

    public void showMainScreen() {
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        heroPanel.setVisible(true);
        mainTextPanel.setVisible(true);
        choiceButtonPanel.setVisible(true);
    }

    public void updateCurrentHPLabel(int currentHP) {
        heroPanel.getHpLabelNumber().setText(Integer.toString(currentHP));
    }

    public void updateCurrentWeaponLabel(Weapon weapon) {
        heroPanel.getWeaponLabelName().setText(weapon.getName());
    }

    public void updateMainTextArea(String mainText) {
        mainTextPanel.getMainTextArea().setText(mainText);
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
