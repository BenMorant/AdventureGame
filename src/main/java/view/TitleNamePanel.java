package view;

import java.awt.*;

import static logic.Game.TITLE;

public class TitleNamePanel extends GamePanel {

    private final Font titleFont = new Font("Times New Roman", Font.BOLD, 52);

    private final GameLabel titleNameLabel;

    public TitleNamePanel() {
        super(250, 250, 800, 150);
        titleNameLabel = new GameLabel(TITLE.toUpperCase(), Color.white, titleFont);
        createTitleNamePanel();
    }

    public void createTitleNamePanel() {
        buildTitleNamePanel();
        setVisible(true);
    }

    private void buildTitleNamePanel() {
        add(titleNameLabel);
    }
}
