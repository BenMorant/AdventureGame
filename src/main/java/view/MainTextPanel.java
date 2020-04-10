package view;

public class MainTextPanel extends GamePanel {

    private final GameTextArea mainTextArea;


    public MainTextPanel() {
        super(40, 650, 750, 550);
        mainTextArea = new GameTextArea("yo", 40, 650, 750, 350);
        createMainTextPanel();
    }

    public void createMainTextPanel() {
        buildMainTextPanel();
        setVisible(true);
    }

    private void buildMainTextPanel() {
        add(mainTextArea);
    }
}
