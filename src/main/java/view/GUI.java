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
    // private TitlePanel titlePanel;
//    private TitleNamePanel titleNamePanel;
//    private StartButtonPanel startButtonPanel;
//    private HeroPanel heroPanel;
//    private ChoiceButtonPanel choiceButtonPanel;
//    private MainTextPanel mainTextPanel;
    private VisibilityManager visibilityManager;
    //    ImagePanelHeroPicture imagePanelHeroPicture;
//    ImagePanelMain imagePanelMain;


    public GUI(Screen screen) {
        this.screen = screen;
        titleWindow = new TitleWindow();
        mainWindow = new MainWindow();
        // titlePanel = new TitlePanel();
//        titleNamePanel = new TitleNamePanel();
//        startButtonPanel = new StartButtonPanel();
//        heroPanel = new HeroPanel();
//        mainTextPanel = new MainTextPanel();
//        choiceButtonPanel = new ChoiceButtonPanel();
        addPanels();
        //   window.setVisible(true);
        visibilityManager = new VisibilityManager(this);
    }


    public void addPanels() {
        titleContainer = titleWindow.getContentPane();
        mainContainer = mainWindow.getContentPane();
//        container.add(titlePanel);
//        System.out.println(titlePanel);
//        container.add(titleNamePanel);
//        container.add(startButtonPanel);
//        container.add(heroPanel);
//        container.add(mainTextPanel);
//        container.add(choiceButtonPanel);
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

//    public TitleNamePanel getTitleNamePanel() {
//        return titleNamePanel;
//    }
//
//    public void setTitleNamePanel(TitleNamePanel titleNamePanel) {
//        this.titleNamePanel = titleNamePanel;
//    }
//
//    public StartButtonPanel getStartButtonPanel() {
//        return startButtonPanel;
//    }
//
//    public void setStartButtonPanel(StartButtonPanel startButtonPanel) {
//        this.startButtonPanel = startButtonPanel;
//    }

//    public HeroPanel getHeroPanel() {
//        return heroPanel;
//    }
//
//    public void setHeroPanel(HeroPanel heroPanel) {
//        this.heroPanel = heroPanel;
//    }
//
//    public ChoiceButtonPanel getChoiceButtonPanel() {
//        return choiceButtonPanel;
//    }
//
//    public void setChoiceButtonPanel(ChoiceButtonPanel choiceButtonPanel) {
//        this.mainWindow.getChoiceButtonPanel(choiceButtonPanel);
//    }
//
//    public MainTextPanel getMainTextPanel() {
//        return mainTextPanel;
//    }
//
//    public void setMainTextPanel(MainTextPanel mainTextPanel) {
//        this.mainTextPanel = mainTextPanel;
//    }

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
