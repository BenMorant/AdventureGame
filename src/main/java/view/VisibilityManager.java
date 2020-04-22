package view;

public class VisibilityManager {

    private final GUI gui;
    
    public VisibilityManager(GUI parentGui) {
        gui = parentGui;
    }

    public void showTitleScreen() {
        gui.getTitleNamePanel().setVisible(true);
        gui.getStartButtonPanel().setVisible(true);
        gui.getHeroPanel().setVisible(false);
        gui.getMainTextPanel().setVisible(false);
        gui.getChoiceButtonPanel().setVisible(false);
    }

    public void showMainScreen() {
        gui.getTitleNamePanel().setVisible(false);
        gui.getStartButtonPanel().setVisible(false);
        gui.getHeroPanel().setVisible(true);
        gui.getMainTextPanel().setVisible(true);
        gui.getChoiceButtonPanel().setVisible(true);
    }

}