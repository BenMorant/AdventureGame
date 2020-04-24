package view;

//public class TitlePanel extends GamePanel {
public class MainWindow extends Window {

    private HeroPanel heroPanel;
    private ChoiceButtonPanel choiceButtonPanel;
    private MainTextPanel mainTextPanel;

    public MainWindow() {
        super();
        // super(0,0, DEFAULT_WIDTH, DEFAULT_HEIGHT);
//        setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
//        setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
//        setMaximumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        heroPanel = new HeroPanel();
        mainTextPanel = new MainTextPanel();
        choiceButtonPanel = new ChoiceButtonPanel();
        createMainWindow();
    }

    public void createMainWindow() {
        add(heroPanel);
        add(mainTextPanel);
        add(choiceButtonPanel);
    }

    public HeroPanel getHeroPanel() {
        return heroPanel;
    }

    public void setHeroPanel(HeroPanel heroPanel) {
        this.heroPanel = heroPanel;
    }

    public ChoiceButtonPanel getChoiceButtonPanel() {
        return choiceButtonPanel;
    }

    public void setChoiceButtonPanel(ChoiceButtonPanel choiceButtonPanel) {
        this.choiceButtonPanel = choiceButtonPanel;
    }

    public MainTextPanel getMainTextPanel() {
        return mainTextPanel;
    }

    public void setMainTextPanel(MainTextPanel mainTextPanel) {
        this.mainTextPanel = mainTextPanel;
    }
}
