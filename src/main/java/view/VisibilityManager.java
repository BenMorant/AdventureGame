package view;

public class VisibilityManager {

    private final GUI gui;

    public VisibilityManager(GUI gui) {
        this.gui = gui;
    }

    public void showTitleScreen() {
        gui.titleNamePanel.setVisible(true);
        gui.startButtonPanel.setVisible(true);
        gui.heroPanel.setVisible(false);
        gui.mainTextPanel.setVisible(false);
        gui.choiceButtonPanel.setVisible(false);
    }

    public void showMainScreen() {
        gui.titleNamePanel.setVisible(false);
        gui.startButtonPanel.setVisible(false);
        gui.heroPanel.setVisible(true);
        gui.mainTextPanel.setVisible(true);
        gui.choiceButtonPanel.setVisible(true);
    }

}