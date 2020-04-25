package view;

public class TitleGameFrame extends GameFrame {

    private TitleNamePanel titleNamePanel;
    private StartButtonPanel startButtonPanel;

    public TitleGameFrame() {
        super();
        titleNamePanel = new TitleNamePanel();
        startButtonPanel = new StartButtonPanel();
        createTitleWindow();
    }

    public void createTitleWindow() {
        add(titleNamePanel);
        add(startButtonPanel);
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
}
