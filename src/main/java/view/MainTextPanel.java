package view;

public class MainTextPanel extends GamePanel {

    private GameTextArea mainTextArea;


    public MainTextPanel() {
        super(40, 650, 750, 550);
        mainTextArea = new GameTextArea("yo", 40, 650, 750, 350);
        createMainTextPanel();
    }

    public void createMainTextPanel() {
        add(mainTextArea);
    }

    public GameTextArea getMainTextArea() {
        return mainTextArea;
    }

    public void setMainTextArea(GameTextArea mainTextArea) {
        this.mainTextArea = mainTextArea;
    }

    @Override
    public String toString() {
        return "MainTextPanel{" +
                "mainTextArea=" + mainTextArea +
                ", ui=" + ui +
                ", listenerList=" + listenerList +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}
