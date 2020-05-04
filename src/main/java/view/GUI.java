package view;

import model.Model;

import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class GUI extends JFrame implements ActionListener {

    public static final String GAME_TITLE = "L'aventure n'attend pas";
    private static final int MINIMUM_WIDTH = 1280;
    private static final int MINIMUM_HEIGHT = MINIMUM_WIDTH / 12 * 9;

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
    private JButton choice1;
    private JButton choice2;
    private JButton choice3;
    private JButton choice4;
    private JLabel peopleHpLabel;
    private JLabel peopleHpLabelNumber;
    private JLabel portraitLabel;
    private JLabel mainImageLabel;

    private JLabel gameOverLabel;
    private JButton newGameButton;




    private Model model;

public GUI(Model model) {
    this.model = model;

    initLookAndFeel();

    this.setTitle(GAME_TITLE);
    this.setMinimumSize(new Dimension(MINIMUM_WIDTH, MINIMUM_HEIGHT));
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(true);
    setDefaultLookAndFeelDecorated(true);

    setContentPane(container);
    container.setLayout(cardLayout);


    titleNamePanel = new JPanel();
    titleNameLabel = new JLabel("title");
    titleNamePanel.add(titleNameLabel);
    titleNamePanel.setBackground(Color.pink);
    titleNameLabel.setFont(new Font("Times New Roman", Font.PLAIN, 167));
    startButtonPanel = new JPanel();
    startButton = new JButton("start");
    startButtonPanel.add(startButton);
    startButtonPanel.setBackground(Color.green);

    titleScreen = new JPanel();
    titleScreen.setLayout(new GridBagLayout());
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.weightx = 1;
    gridBagConstraints.weighty = 1;
    gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.insets = new Insets(10, 10, 10, 10);
    titleScreen.add(titleNamePanel, gridBagConstraints);

    gridBagConstraints.fill = GridBagConstraints.NONE;
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 1;
    gridBagConstraints.insets = new Insets(10, 10, 10, 10);
    titleScreen.add(startButtonPanel, gridBagConstraints);

    startButton.addActionListener(this);

    mainScreen = new JPanel();

    mainTextPanel = new JPanel();
    mainTextArea = new JTextArea("once upon a time...");
    mainTextArea.setLineWrap(true);
    mainTextArea.setWrapStyleWord(true);
    mainTextArea.setEditable(false);
    mainTextPanel.add(mainTextArea);
    choicesPanel = new JPanel(new GridLayout(4, 1));
    choice1 = new JButton("choice 1");
    choice2 = new JButton("choice 2");
    choice3 = new JButton("choice 3");
    choice4 = new JButton("choice 4");
    choicesPanel.add(choice1);
    choicesPanel.add(choice2);
    choicesPanel.add(choice3);
    choicesPanel.add(choice4);

    attributesPanel = new JPanel(new GridLayout(1,2));
    peopleHpLabel = new JLabel("HP : ");
    peopleHpLabelNumber = new JLabel(String.valueOf(model.getPeople().getCurrentHp()));
    attributesPanel.add(peopleHpLabel);
    attributesPanel.add(peopleHpLabelNumber);


    mainImagePanel = new JPanel();
    mainImageLabel = new JLabel("main image label");
    mainImagePanel.add(mainImageLabel);

    portraitPanel = new JPanel();
    portraitLabel = new JLabel("portrait label");
    portraitPanel.add(portraitLabel);
    mainScreen.add(mainImagePanel);
    mainScreen.add(mainTextPanel);
    mainScreen.add(portraitPanel);
    mainScreen.add(attributesPanel);
    mainScreen.add(choicesPanel);

gameOverScreen = new JPanel();
gameOverPanel = new JPanel();
    gameOverLabel = new JLabel("GAME OVER");
    gameOverPanel.add(gameOverLabel);
newGamePanel = new JPanel();
newGameButton = new JButton("New Game");
newGamePanel.add(newGameButton);

gameOverScreen.add(gameOverPanel);
gameOverScreen.add(newGamePanel);



        container.add(titleScreen, "1");
        container.add(mainScreen, "2");
        container.add(gameOverScreen, "3");
        cardLayout.show(container, "1");
        pack();
        setVisible(true);

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

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        cardLayout.show(container, "2");
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

    public JButton getChoice1() {
        return choice1;
    }

    public void setChoice1(JButton choice1) {
        this.choice1 = choice1;
    }

    public JButton getChoice2() {
        return choice2;
    }

    public void setChoice2(JButton choice2) {
        this.choice2 = choice2;
    }

    public JButton getChoice3() {
        return choice3;
    }

    public void setChoice3(JButton choice3) {
        this.choice3 = choice3;
    }

    public JButton getChoice4() {
        return choice4;
    }

    public void setChoice4(JButton choice4) {
        this.choice4 = choice4;
    }

    public JLabel getPeopleHpLabel() {
        return peopleHpLabel;
    }

    public void setPeopleHpLabel(JLabel peopleHpLabel) {
        this.peopleHpLabel = peopleHpLabel;
    }

    public JLabel getPeopleHpLabelNumber() {
        return peopleHpLabelNumber;
    }

    public void setPeopleHpLabelNumber(JLabel peopleHpLabelNumber) {
        this.peopleHpLabelNumber = peopleHpLabelNumber;
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

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
