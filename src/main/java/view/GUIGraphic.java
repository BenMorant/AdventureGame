package view;

import model.GameOverScene;
import model.MainScene;
import model.Model;
import model.People;
import model.TitleScene;

import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class GUIGraphic extends GUI {

    private static final int MINIMUM_WIDTH = 1280;
    private static final int MINIMUM_HEIGHT = MINIMUM_WIDTH / 12 * 9;

    private JFrame gameFrame = new JFrame();
    private JPanel container = new JPanel();
    private CardLayout cardLayout = new CardLayout();

    private JPanel titleScreen;
    private JPanel titleNamePanel;
    private JPanel startButtonPanel;
    private JPanel mainScreen;
    private JPanel attributesPanel;
    private JPanel choicesPanel;
    private JPanel mainTextPanel;
    private JPanel mainImagePanel;
    private JPanel portraitPanel;
    private JPanel gameOverScreen;
    private JPanel gameOverPanel;
    private JPanel newGamePanel;

    private JLabel titleNameLabel;
    private JButton startButton;

    private JTextArea mainTextArea;
    private JButton choiceButton;
    private JLabel hpLabel;
    private JLabel hpLabelNumber;
    private JLabel portraitLabel;
    private JLabel mainImageLabel;
    private JLabel weaponLabel;
    private JLabel weaponLabelName;

    private JLabel gameOverLabel;
    private JButton newGameButton;



    public GUIGraphic(Model model) {
        super(model);


        initLookAndFeel();

        gameFrame.setTitle(model.getTitleScene().getTitle());
        gameFrame.setMinimumSize(new Dimension(MINIMUM_WIDTH, MINIMUM_HEIGHT));
        gameFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setResizable(true);
        gameFrame.setDefaultLookAndFeelDecorated(true);

        gameFrame.setContentPane(container);
        container.setLayout(cardLayout);

        titleNamePanel = new JPanel();
        titleNameLabel = new JLabel(model.getTitleScene().getTitle().toUpperCase());
        titleNamePanel.add(titleNameLabel);
        titleNamePanel.setBackground(Color.pink);
        titleNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 142));
        startButtonPanel = new JPanel();
        startButton = new JButton(((TitleScene) model.getTitleScene()).getStartStr());
        startButtonPanel.add(startButton);
        startButtonPanel.setBackground(Color.green);

        titleScreen = new JPanel();
        titleScreen.setLayout(new GridBagLayout());
        GridBagConstraints gbcTitleScreen = new GridBagConstraints();
        gbcTitleScreen.weightx = 1;
        gbcTitleScreen.weighty = 1;
        gbcTitleScreen.fill = GridBagConstraints.HORIZONTAL;
        gbcTitleScreen.gridx = 1;
        gbcTitleScreen.gridy = 1;
        gbcTitleScreen.gridwidth = 3;
        gbcTitleScreen.insets = new Insets(10, 10, 10, 10);
        titleScreen.add(titleNamePanel, gbcTitleScreen);

        gbcTitleScreen.fill = GridBagConstraints.NONE;
        gbcTitleScreen.gridx = 1;
        gbcTitleScreen.gridy = 2;
        gbcTitleScreen.gridwidth = 1;
        gbcTitleScreen.insets = new Insets(10, 10, 10, 10);
        titleScreen.add(startButtonPanel, gbcTitleScreen);

        mainScreen = new JPanel();
        mainScreen.setLayout(new GridBagLayout());
        GridBagConstraints gbcMainScreen = new GridBagConstraints();
        gbcMainScreen.weightx = 1;
        gbcMainScreen.weighty = 1;

        mainImagePanel = new JPanel();
        mainImagePanel.setBackground(Color.lightGray);
        mainImageLabel = new JLabel("main image label");
        mainImagePanel.add(mainImageLabel);

        mainTextPanel = new JPanel();
        mainTextPanel.setBackground(Color.orange);
        mainTextArea = new JTextArea(((MainScene) model.getMainScene()).getStoryBlock());
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);
        choicesPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        choicesPanel.setBackground(Color.yellow);

        choiceButton = new JButton(((MainScene) model.getMainScene()).getChoice());
        choicesPanel.add(choiceButton);


        attributesPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        attributesPanel.setBackground(Color.blue);
        hpLabel = new JLabel("HP : ");
        hpLabelNumber = new JLabel(String.valueOf(model.getPlayer().getHp()));
        weaponLabel = new JLabel("Arme : ");
        weaponLabelName = new JLabel(model.getPlayer().getWeapon());
        attributesPanel.add(hpLabel);
        attributesPanel.add(hpLabelNumber);
        attributesPanel.add(weaponLabel);
        attributesPanel.add(weaponLabelName);

        portraitPanel = new JPanel();
        portraitPanel.setBackground(Color.black);
        portraitLabel = new JLabel("portrait label");
        portraitPanel.add(portraitLabel);

        gbcMainScreen.gridx = 0;
        gbcMainScreen.gridy = 0;
        gbcMainScreen.gridwidth = 4;
        gbcMainScreen.gridheight = 4;
        gbcTitleScreen.insets = new Insets(10, 10, 10, 10);
        mainScreen.add(mainImagePanel, gbcMainScreen);

        gbcMainScreen.gridx = 0;
        gbcMainScreen.gridy = 4;
        gbcMainScreen.gridwidth = 4;
        gbcMainScreen.gridheight = 2;
        gbcTitleScreen.insets = new Insets(10, 10, 10, 10);
        mainScreen.add(mainTextPanel, gbcMainScreen);

        gbcMainScreen.gridx = 5;
        gbcMainScreen.gridy = 0;
        gbcMainScreen.gridwidth = 1;
        gbcMainScreen.gridheight = 1;
        gbcTitleScreen.insets = new Insets(10, 10, 10, 10);
        mainScreen.add(portraitPanel, gbcMainScreen);

        gbcMainScreen.gridx = 4;
        gbcMainScreen.gridy = 1;
        gbcMainScreen.gridwidth = 3;
        gbcMainScreen.gridheight = 3;
        mainScreen.add(attributesPanel, gbcMainScreen);

        gbcMainScreen.gridx = 4;
        gbcMainScreen.gridy = 4;
        gbcMainScreen.gridwidth = 3;
        gbcMainScreen.gridheight = 2;
        gbcTitleScreen.insets = new Insets(10, 10, 10, 10);
        mainScreen.add(choicesPanel, gbcMainScreen);

        gameOverScreen = new JPanel();
        gameOverScreen.setLayout(new GridBagLayout());
        GridBagConstraints gbcGameOverScreen = new GridBagConstraints();
        gbcGameOverScreen.weightx = 1;
        gbcGameOverScreen.weighty = 1;

        gameOverPanel = new JPanel();
        gameOverLabel = new JLabel(((GameOverScene) model.getGameOverScene()).getGameOverStr().toUpperCase());
        gameOverPanel.add(gameOverLabel);
        gameOverPanel.setBackground(Color.pink);
        gameOverLabel.setFont(new Font("Times New Roman", Font.PLAIN, 167));
        newGamePanel = new JPanel();
        newGameButton = new JButton(((GameOverScene) model.getGameOverScene()).getNewGameStr());
        newGamePanel.add(newGameButton);
        newGamePanel.setBackground(Color.green);

        gameOverScreen.add(gameOverPanel, gbcGameOverScreen);
        gameOverScreen.add(newGamePanel, gbcGameOverScreen);


        container.add(titleScreen, "titleScreen");
        container.add(mainScreen, "mainScreen");
        container.add(gameOverScreen, "gameOverScreen");
        cardLayout.show(container, "titleScreen");
        gameFrame.pack();
        gameFrame.setVisible(true);

    }

    public void initLookAndFeel() {
        SynthLookAndFeel synth = new SynthLookAndFeel();
        try {
            synth.load(this.getClass()
                    .getResourceAsStream("/laf.xml"), this.getClass());
            UIManager.setLookAndFeel(synth);
        } catch (ParseException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }


    public void addSceneChangeListener(ActionListener sceneChangeListener) {
        startButton.addActionListener(sceneChangeListener);
    }

    public void addChoiceListener(ActionListener choiceListener) {
        choiceButton.addActionListener(choiceListener);
    }


    public JPanel getContainer() {
        return container;
    }

    public void setContainer(JPanel container) {
        this.container = container;
    }

    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public void setCardLayout(CardLayout cardLayout) {
        this.cardLayout = cardLayout;
    }

    public JPanel getTitleScreen() {
        return titleScreen;
    }

    public void setTitleScreen(JPanel titleScreen) {
        this.titleScreen = titleScreen;
    }

    public JPanel getTitleNamePanel() {
        return titleNamePanel;
    }

    public void setTitleNamePanel(JPanel titleNamePanel) {
        this.titleNamePanel = titleNamePanel;
    }

    public JPanel getStartButtonPanel() {
        return startButtonPanel;
    }

    public void setStartButtonPanel(JPanel startButtonPanel) {
        this.startButtonPanel = startButtonPanel;
    }

    public JPanel getMainScreen() {
        return mainScreen;
    }

    public void setMainScreen(JPanel mainScreen) {
        this.mainScreen = mainScreen;
    }

    public JPanel getAttributesPanel() {
        return attributesPanel;
    }

    public void setAttributesPanel(JPanel attributesPanel) {
        this.attributesPanel = attributesPanel;
    }

    public JPanel getChoicesPanel() {
        return choicesPanel;
    }

    public void setChoicesPanel(JPanel choicesPanel) {
        this.choicesPanel = choicesPanel;
    }

    public JPanel getMainTextPanel() {
        return mainTextPanel;
    }

    public void setMainTextPanel(JPanel mainTextPanel) {
        this.mainTextPanel = mainTextPanel;
    }

    public JPanel getMainImagePanel() {
        return mainImagePanel;
    }

    public void setMainImagePanel(JPanel mainImagePanel) {
        this.mainImagePanel = mainImagePanel;
    }

    public JPanel getPortraitPanel() {
        return portraitPanel;
    }

    public void setPortraitPanel(JPanel portraitPanel) {
        this.portraitPanel = portraitPanel;
    }

    public JPanel getGameOverScreen() {
        return gameOverScreen;
    }

    public void setGameOverScreen(JPanel gameOverScreen) {
        this.gameOverScreen = gameOverScreen;
    }

    public JPanel getGameOverPanel() {
        return gameOverPanel;
    }

    public void setGameOverPanel(JPanel gameOverPanel) {
        this.gameOverPanel = gameOverPanel;
    }

    public JPanel getNewGamePanel() {
        return newGamePanel;
    }

    public void setNewGamePanel(JPanel newGamePanel) {
        this.newGamePanel = newGamePanel;
    }

    public JLabel getTitleNameLabel() {
        return titleNameLabel;
    }

    public void setTitleNameLabel(JLabel titleNameLabel) {
        this.titleNameLabel = titleNameLabel;
    }

    public JButton getStartButton() {
        return startButton;
    }

    public void setStartButton(JButton startButton) {
        this.startButton = startButton;
    }

    public JTextArea getMainTextArea() {
        return mainTextArea;
    }

    public void setMainTextArea(JTextArea mainTextArea) {
        this.mainTextArea = mainTextArea;
    }

    public JButton getChoiceButton() {
        return choiceButton;
    }

    public void setChoiceButton(JButton choiceButton) {
        this.choiceButton = choiceButton;
    }

    public JLabel getHpLabel() {
        return hpLabel;
    }

    public void setHpLabel(JLabel hpLabel) {
        this.hpLabel = hpLabel;
    }

    public JLabel getHpLabelNumber() {
        return hpLabelNumber;
    }

    public void setHpLabelNumber(JLabel hpLabelNumber) {
        this.hpLabelNumber = hpLabelNumber;
    }

    public JLabel getPortraitLabel() {
        return portraitLabel;
    }

    public void setPortraitLabel(JLabel portraitLabel) {
        this.portraitLabel = portraitLabel;
    }

    public JLabel getMainImageLabel() {
        return mainImageLabel;
    }

    public void setMainImageLabel(JLabel mainImageLabel) {
        this.mainImageLabel = mainImageLabel;
    }

    public JLabel getWeaponLabel() {
        return weaponLabel;
    }

    public void setWeaponLabel(JLabel weaponLabel) {
        this.weaponLabel = weaponLabel;
    }

    public JLabel getWeaponLabelName() {
        return weaponLabelName;
    }

    public void setWeaponLabelName(JLabel weaponLabelName) {
        this.weaponLabelName = weaponLabelName;
    }

    public JLabel getGameOverLabel() {
        return gameOverLabel;
    }

    public void setGameOverLabel(JLabel gameOverLabel) {
        this.gameOverLabel = gameOverLabel;
    }

    public JButton getNewGameButton() {
        return newGameButton;
    }

    public void setNewGameButton(JButton newGameButton) {
        this.newGameButton = newGameButton;
    }

    @Override
    public void update(String str) {

    }

    @Override
    public void update(int number) {

    }

    @Override
    public void update(People people) {
        hpLabelNumber.setText(Integer.toString(people.getHp()));
        weaponLabelName.setText(people.getWeapon());

    }
}
