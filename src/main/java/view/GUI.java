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
    startButtonPanel = new JPanel();
    startButton = new JButton("start");
    startButtonPanel.add(startButton);

    titleScreen = new JPanel();
    titleScreen.setLayout(new GridBagLayout());
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.insets = new Insets(10, 10, 10, 10);

    titleScreen.add(titleNamePanel, gridBagConstraints);
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
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
    peopleHpLabelNumber = new JLabel("how much buddy ?");
    attributesPanel.add(peopleHpLabel);
    attributesPanel.add(peopleHpLabelNumber);


    mainImagePanel = new JPanel();
    mainImageLabel = new JLabel("main image label");
    mainImagePanel.add(mainImageLabel);

    portraitPanel = new JPanel();
    portraitLabel = new JLabel("portrait label");
    portraitPanel.add(portraitLabel);

    mainScreen.add(choicesPanel);
    mainScreen.add(mainImagePanel);
    mainScreen.add(portraitPanel);
    mainScreen.add(attributesPanel);
    mainScreen.add(mainTextPanel);

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
        setVisible(true);
        pack();

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
}
