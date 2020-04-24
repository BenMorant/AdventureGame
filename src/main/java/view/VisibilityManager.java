package view;

public class VisibilityManager {

    private final GUI gui;
    
    public VisibilityManager(GUI parentGui) {
        gui = parentGui;
    }

    public void showTitleScreen() {
        gui.getTitleWindow().setVisible(true);
        gui.getMainWindow().setVisible(false);
    }

    public void showMainScreen() {
        gui.getTitleWindow().setVisible(false);
        gui.getMainWindow().setVisible(true);
    }
}