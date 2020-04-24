package view;

import model.entity.people.Hero;
import model.entity.screens.Screen;

import java.awt.*;

public final class GUI {

    private final Screen screen;

    private Window window;
    private Container container;
    private TitleNamePanel titleNamePanel;
    private StartButtonPanel startButtonPanel;
    private HeroPanel heroPanel;
    private ChoiceButtonPanel choiceButtonPanel;
    private MainTextPanel mainTextPanel;
    private VisibilityManager visibilityManager;
    //    ImagePanelHeroPicture imagePanelHeroPicture;
//    ImagePanelMain imagePanelMain;


    public GUI(Screen screen) {
        this.screen = screen;
        window = new Window();
        titleNamePanel = new TitleNamePanel();
        startButtonPanel = new StartButtonPanel();
        heroPanel = new HeroPanel();
        mainTextPanel = new MainTextPanel();
        choiceButtonPanel = new ChoiceButtonPanel();
        addPanels();
        window.setVisible(true);
        visibilityManager = new VisibilityManager(this);
    }

    public void addPanels() {
        container = window.getContentPane();
        container.add(titleNamePanel);
        container.add(startButtonPanel);
        container.add(heroPanel);
        container.add(mainTextPanel);
        container.add(choiceButtonPanel);
    }


//    public void updateCurrentHPLabel(int currentHP) {
//        heroPanel.getHpLabelNumber().setText(Integer.toString(currentHP));
//    }
//
//    public void updateCurrentWeaponLabel(Weapon weapon) {
//        heroPanel.getWeaponLabelName().setText(weapon.getName());
//    }

    public void updateHeroPanel(Hero heroToUpdate) {
        heroPanel.getHpLabelNumber().setText(Integer.toString(heroToUpdate.getHp()));
        heroPanel.getWeaponLabelName().setText(heroToUpdate.getCurrentWeapon().getName());
    }

    public void updateStoryBlock(String mainText) {
        mainTextPanel.getMainTextArea().setText(mainText);
    }

    //    public void updateChoiceButtons(String choice1, String choice2, String choice3, String choice4) {
    public void updateChoices(String[] choices) {
        choiceButtonPanel.getChoiceButtons()[0].setText(choices[0]);
        choiceButtonPanel.getChoiceButtons()[1].setText(choices[1]);
        choiceButtonPanel.getChoiceButtons()[2].setText(choices[2]);
        choiceButtonPanel.getChoiceButtons()[3].setText(choices[3]);
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

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public TitleNamePanel getTitleNamePanel() {
        return titleNamePanel;
    }

    public void setTitleNamePanel(TitleNamePanel titleNamePanel) {
        this.titleNamePanel = titleNamePanel;
    }

    public StartButtonPanel getStartButtonPanel() {
        return startButtonPanel;
    }

    public void setStartButtonPanel(StartButtonPanel startButtonPanel) {
        this.startButtonPanel = startButtonPanel;
    }

    public HeroPanel getHeroPanel() {
        return heroPanel;
    }

    public void setHeroPanel(HeroPanel heroPanel) {
        this.heroPanel = heroPanel;
    }

    public ChoiceButtonPanel getChoiceButtonPanel() {
        return choiceButtonPanel;
    }

    public void setChoiceButtonPanel(ChoiceButtonPanel choiceButtonPanel) {
        this.choiceButtonPanel = choiceButtonPanel;
    }

    public MainTextPanel getMainTextPanel() {
        return mainTextPanel;
    }

    public void setMainTextPanel(MainTextPanel mainTextPanel) {
        this.mainTextPanel = mainTextPanel;
    }

    public VisibilityManager getVisibilityManager() {
        return visibilityManager;
    }

    public void setVisibilityManager(VisibilityManager visibilityManager) {
        this.visibilityManager = visibilityManager;
    }
}
