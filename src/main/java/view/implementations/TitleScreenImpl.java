package view.implementations;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

//public class TitleScreen extends JPanel implements TitleScreenInterface {

    public class TitleScreenImpl extends JPanel {

    private static final String START_BUTTON_TEXT = "C'est parti !";

    private JPanel titleNamePanel = new JPanel();
    private JPanel startButtonPanel = new JPanel();
    private JButton startButton;
    private JLabel titleLabel;
    private LayoutManager migLayout;

    public TitleScreenImpl(String title) {
        super();
        this.setLayout(new MigLayout("", "[grow]", "[grow]"));
        titleLabel = new JLabel(title);
        startButton = new JButton(START_BUTTON_TEXT);
        titleNamePanel.add(titleLabel);
        startButtonPanel.add(startButton);
//        this.startButton = new JButton(START_BUTTON_TEXT );
       add(titleNamePanel, "wrap, center");
      add(startButtonPanel, "center");
//        displayTitle(title);
//        displayStartButton(START_BUTTON_TEXT);
    }

//    @Override
//    public void displayTitle(String title) {
//        this.titleLabel = new JLabel(title);
//        this.add((titleLabel),"wrap, center");
//
//    }
//
//    @Override
//    public void displayStartButton(String startButtonText) {
//        startButton = new JButton(startButtonText);
//        this.add((startButton), "center");
//
//    }
//
//    public JButton getStartButton() {
//        return startButton;
//    }
//
//    public void setStartButton(JButton startButton) {
//        this.startButton = startButton;
//    }
//
//    public JLabel getTitleLabel() {
//        return titleLabel;
//    }
//
//    public void setTitleLabel(JLabel titleLabel) {
//        this.titleLabel = titleLabel;
//    }
//
//    @Override
//    public void setLayout() {
//        migLayout = new MigLayout("[grow]", "[grow]");
//
//    }


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

        public JButton getStartButton() {
            return startButton;
        }

        public void setStartButton(JButton startButton) {
            this.startButton = startButton;
        }

        public JLabel getTitleLabel() {
            return titleLabel;
        }

        public void setTitleLabel(JLabel titleLabel) {
            this.titleLabel = titleLabel;
        }
    }
