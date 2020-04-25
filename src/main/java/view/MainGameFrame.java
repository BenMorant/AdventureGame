package view;

public class MainGameFrame extends GameFrame {

    private HeroPanel heroPanel;
    private ChoiceButtonPanel choiceButtonPanel;
    private MainTextPanel mainTextPanel;
//    private ImagePanelHeroPicture imagePanelHeroPicture;
//    private ImagePanelMain imagePanelMain;

    public MainGameFrame() {
        super();
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
