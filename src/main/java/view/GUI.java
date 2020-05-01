package view;

import controller.AbstractController;
import observer.Observer;
import view.implementations.GameFrame;
import view.implementations.TitleScreen;

import javax.swing.*;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.awt.*;

public class GUI implements Observer {

    public static final String GAME_TITLE = "L'aventure n'attend pas";
   // private static final String PATH_RESOURCES = "src/main/resources";
    private static final String SYNTH_FILE = "view/laf.xml";

    private JFrame gameFrame = new GameFrame(GAME_TITLE);

    private JPanel container = new JPanel();
 //   private JButton startButton = new JButton("start");
 //   private JPanel titlePanel = new JPanel();
    private JPanel titleScreen;
    private JPanel mainPanel = new JPanel();
    private CardLayout cardLayout = new CardLayout();

//    private static String synthFile = PATH_RESOURCES +"/" + SYNTH_FILE;
  //  private SynthLookAndFeel laf = new SynthLookAndFeel();

    private AbstractController controller;

    public GUI(AbstractController controller) {

        initLookAndFeel();

        titleScreen = new TitleScreen(GAME_TITLE);
//        System.out.println(synthFile);
        this.controller = controller;
        gameFrame.setContentPane(container);
//        container.setBackground(Color.black);
        container.setLayout(cardLayout);
    //    titlePanel.add(startButton);
//        titleScreen.setBackground(Color.green);
//        mainPanel.setBackground(Color.pink);
        container.add(titleScreen, "1");
        container.add(mainPanel, "2");
        cardLayout.show(container, "1");
//        titleScreen.getStartButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                cardLayout.show(container, "2");
//            }
//        });

        gameFrame.setVisible(true);
        gameFrame.pack();

    }


    private static void initLookAndFeel() {
        // String lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
        SynthLookAndFeel lookAndFeel = new SynthLookAndFeel();


        try {
            lookAndFeel.load(GUI.class.getResourceAsStream(SYNTH_FILE),
                    GUI.class);
            UIManager.setLookAndFeel(lookAndFeel);
        }

        catch (Exception e) {
            System.err.println("Couldn't get specified look and feel ("
                    + lookAndFeel
                    + "), for some reason.");
            System.err.println("Using the default look and feel.");
            e.printStackTrace();
        }

    }

    @Override
    public void update(String string) {

    }
}
