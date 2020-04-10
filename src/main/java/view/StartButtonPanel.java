package view;

public class StartButtonPanel extends GamePanel {

    private final GameButton startButton = new GameButton("C'EST PARTI !");

    public StartButtonPanel() {
        super(500, 600, 250, 120);
        createStartButtonPanel();
    }

    public void createStartButtonPanel() {
        buildStartButtonPanel();
        setVisible(true);
    }

    private void buildStartButtonPanel() {
        add(startButton);
    }
}
