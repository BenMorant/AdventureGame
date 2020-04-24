package view;

//public class TitlePanel extends GamePanel {
public class TitleWindow extends Window {

    private TitleNamePanel titleNamePanel;
    private StartButtonPanel startButtonPanel;

    public TitleWindow() {
        super();
        // super(0,0, DEFAULT_WIDTH, DEFAULT_HEIGHT);
//        setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
//        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
//        setMaximumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
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
