package view;

import model.entity.people.Hero;
import model.entity.screens.Screen;

import java.awt.*;

public final class GUI {

    private final Screen screen;

    private TitleWindow titleWindow;
    private MainWindow mainWindow;
    private Container titleContainer;
    private Container mainContainer;
    private VisibilityManager visibilityManager;
    //    ImagePanelHeroPicture imagePanelHeroPicture;
//    ImagePanelMain imagePanelMain;


    public GUI(Screen screen) {
        this.screen = screen;
        titleWindow = new TitleWindow();
        mainWindow = new MainWindow();
        addPanels();
        visibilityManager = new VisibilityManager(this);
    }


    public void addPanels() {
        titleContainer = titleWindow.getContentPane();
        mainContainer = mainWindow.getContentPane();
    }


//    public void updateCurrentHPLabel(int currentHP) {
//        heroPanel.getHpLabelNumber().setText(Integer.toString(currentHP));
//    }
//
//    public void updateCurrentWeaponLabel(Weapon weapon) {
//        heroPanel.getWeaponLabelName().setText(weapon.getName());
//    }

    public void updateHeroPanel(Hero heroToUpdate) {
        mainWindow.getHeroPanel().getHpLabelNumber().setText(Integer.toString(heroToUpdate.getHp()));
        mainWindow.getHeroPanel().getWeaponLabelName().setText(heroToUpdate.getCurrentWeapon().getName());
    }

    public void updateStoryBlock(String mainText) {
        mainWindow.getMainTextPanel().getMainTextArea().setText(mainText);
    }

    //    public void updateChoiceButtons(String choice1, String choice2, String choice3, String choice4) {
    public void updateChoices(String[] choices) {
        mainWindow.getChoiceButtonPanel().getChoiceButtons()[0].setText(choices[0]);
        mainWindow.getChoiceButtonPanel().getChoiceButtons()[1].setText(choices[1]);
        mainWindow.getChoiceButtonPanel().getChoiceButtons()[2].setText(choices[2]);
        mainWindow.getChoiceButtonPanel().getChoiceButtons()[3].setText(choices[3]);
    }

    public void updateChoiceButtonsNoActions() {
        mainWindow.getChoiceButtonPanel().getChoiceButtons()[0].setText(">");
        mainWindow.getChoiceButtonPanel().getChoiceButtons()[1].setText("");
        mainWindow.getChoiceButtonPanel().getChoiceButtons()[2].setText("");
        mainWindow.getChoiceButtonPanel().getChoiceButtons()[3].setText("");
    }

    public void hideChoiceButtons() {
        for (GameButton choiceButton : mainWindow.getChoiceButtonPanel().getChoiceButtons()) {
            choiceButton.setText("");
            choiceButton.setVisible(false);
        }
    }

    public TitleWindow getTitleWindow() {
        return titleWindow;
    }

    public void setTitleWindow(TitleWindow titleWindow) {
        this.titleWindow = titleWindow;
    }

    public Container getTitleContainer() {
        return titleContainer;
    }

    public void setTitleContainer(Container titleContainer) {
        this.titleContainer = titleContainer;
    }


    public VisibilityManager getVisibilityManager() {
        return visibilityManager;
    }

    public void setVisibilityManager(VisibilityManager visibilityManager) {
        this.visibilityManager = visibilityManager;
    }

    public Screen getScreen() {
        return screen;
    }

//    public TitleWindow getTitlePanel() {
//        return titlePanel;
//    }
//
//    public void setTitlePanel(TitleWindow titlePanel) {
//        this.titlePanel = titlePanel;
//    }

    public MainWindow getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }
}
