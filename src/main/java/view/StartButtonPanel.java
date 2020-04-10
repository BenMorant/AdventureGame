package view;

public class StartButtonPanel extends GamePanel {

    private GameButton startButton = new GameButton("C'EST PARTI !");

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

    public GameButton getStartButton() {
        return startButton;
    }

    public void setStartButton(GameButton startButton) {
        this.startButton = startButton;
    }

    @Override
    public String toString() {
        return "StartButtonPanel{" +
                "startButton=" + startButton +
                ", ui=" + ui +
                ", listenerList=" + listenerList +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}
