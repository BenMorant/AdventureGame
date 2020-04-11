package view;

import java.awt.*;

import static logic.Game.TITLE;

public class TitleNamePanel extends GamePanel {

    private Font titleFont = new Font("Times New Roman", Font.BOLD, 52);

    private GameLabel titleNameLabel;

    public TitleNamePanel() {
        super(250, 250, 800, 150);
        titleNameLabel = new GameLabel(TITLE.toUpperCase(), Color.white, titleFont);
        createTitleNamePanel();
    }

    public void createTitleNamePanel() {
        add(titleNameLabel);
    }

    public Font getTitleFont() {
        return titleFont;
    }

    public void setTitleFont(Font titleFont) {
        this.titleFont = titleFont;
    }

    public GameLabel getTitleNameLabel() {
        return titleNameLabel;
    }

    public void setTitleNameLabel(GameLabel titleNameLabel) {
        this.titleNameLabel = titleNameLabel;
    }

    @Override
    public String toString() {
        return "TitleNamePanel{" +
                "titleFont=" + titleFont +
                ", titleNameLabel=" + titleNameLabel +
                ", ui=" + ui +
                ", listenerList=" + listenerList +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}
