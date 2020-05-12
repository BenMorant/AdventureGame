package view;

import model.Model;
import observer.Observer;

import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class GUI extends JFrame implements Observer {

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
    private JButton[] choiceButtons;
    private JLabel peopleHpLabel;
    private JLabel peopleHpLabelNumber;
    private JLabel portraitLabel;
    private JLabel mainImageLabel;

    private JLabel gameOverLabel;
    private JButton newGameButton;

    private Model model;

    private ScreenHandler screenHandler;
    private ChoiceHandler choiceHandler;

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

        screenHandler = new ScreenHandler();
        choiceHandler = new ChoiceHandler();
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

        startButton.addActionListener(screenHandler);

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
        mainTextArea = new JTextArea("once upon a time...");
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);
        choicesPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        choicesPanel.setBackground(Color.yellow);

        choiceButtons = new JButton[4];
        for (int i = 0; i < choiceButtons.length; i++) {
            choiceButtons[i] = new JButton("Choice " + (i + 1));
            choiceButtons[i].addActionListener(choiceHandler);
            choiceButtons[i].setActionCommand("c" + (i + 1));

            choicesPanel.add(choiceButtons[i]);
        }

        attributesPanel = new JPanel(new GridLayout(1, 2, 5, 5));
        attributesPanel.setBackground(Color.blue);
        peopleHpLabel = new JLabel("HP : ");
        peopleHpLabelNumber = new JLabel(String.valueOf(model.getPeople().getCurrentHp()));
        attributesPanel.add(peopleHpLabel);
        attributesPanel.add(peopleHpLabelNumber);

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
    gameOverLabel = new JLabel("GAME OVER");
    gameOverPanel.add(gameOverLabel);
    gameOverPanel.setBackground(Color.pink);
    gameOverLabel.setFont(new Font("Times New Roman", Font.PLAIN, 167));
        newGamePanel = new JPanel();
        newGameButton = new JButton("New Game");
        newGamePanel.add(newGameButton);
        newGamePanel.setBackground(Color.green);

        gameOverScreen.add(gameOverPanel, gbcGameOverScreen);
        gameOverScreen.add(newGamePanel, gbcGameOverScreen);


        container.add(titleScreen, "titleScreen");
        container.add(mainScreen, "mainScreen");
        container.add(gameOverScreen, "gameOverScreen");
        cardLayout.show(container, "titleScreen");
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


    public void updatePeopleHp(String newValue) {
        peopleHpLabelNumber.setText(newValue);
    }

    public void updateStoryBlock(String newStoryBlock) {
        mainTextArea.setText(newStoryBlock);
    }

    public void updateChoices(String newChoice1, String newChoice2, String newChoice3, String newChoice4) {
        choiceButtons[0].setText(newChoice1);
        choiceButtons[1].setText(newChoice2);
        choiceButtons[2].setText(newChoice3);
        choiceButtons[3].setText(newChoice4);
    }

    private class ScreenHandler implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            Object source = actionEvent.getSource();
            if (startButton.equals(source)) {
                cardLayout.show(container, "mainScreen");
                model.townGate();
            }
            if (newGameButton.equals(source)) {
                cardLayout.show(container, "mainScreen");
            }


        }
    }

    private class ChoiceHandler implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {
            Object action = actionEvent.getActionCommand();
//            switch (action) {
//                case "c1" : null;
//                break;
//                case "c2" : null;
//                    break;
//                case "c3" : null;
//                    break;
//                case "c4" : null;
//                    break;
//
//            }


        }
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
