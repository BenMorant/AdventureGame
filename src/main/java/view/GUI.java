package view;

import model.items.weapons.Weapon;

import java.awt.*;
import java.awt.event.ActionListener;

public final class GUI {

    private final ActionListener choiceHandler;
    private final ActionListener screenHandler;
    Window window;
    private Container container;
    TitleNamePanel titleNamePanel;
    StartButtonPanel startButtonPanel;
    HeroPanel heroPanel;
    ChoiceButtonPanel choiceButtonPanel;
    MainTextPanel mainTextPanel;
    //    ImagePanelHeroPicture imagePanelHeroPicture;
//    ImagePanelMain imagePanelMain;


    public GUI(ActionListener choiceHandler, ActionListener screenHandler) {
        this.choiceHandler = choiceHandler;
        this.screenHandler = screenHandler;
        window = new Window();
        titleNamePanel = new TitleNamePanel();
        startButtonPanel = new StartButtonPanel(screenHandler);
        heroPanel = new HeroPanel();
        mainTextPanel = new MainTextPanel();
        choiceButtonPanel = new ChoiceButtonPanel(choiceHandler);
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
