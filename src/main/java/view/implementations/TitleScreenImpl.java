//package view.implementations;
//
//import net.miginfocom.swing.MigLayout;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionListener;
//
////public class TitleScreen extends JPanel implements TitleScreenInterface {
//
//    public class TitleScreenImpl extends JPanel {
//
//
//
//    private JPanel titleNamePanel = new JPanel();
//        private JButton startButton;
//    private JPanel startButtonPanel = new StartButtonPanel();
//
//    private JLabel titleLabel;
//    private LayoutManager migLayout;
//
//    public TitleScreenImpl(String title) {
//        super();
//        this.setLayout(new MigLayout("", "[grow]", "[grow]"));
//        titleLabel = new JLabel(title);
//      //  startButton = new JButton(START_BUTTON_TEXT);
//        titleNamePanel.add(titleLabel);
//  //      startButtonPanel.add(startButton);
//       add(titleNamePanel, "wrap, center");
//      add(startButtonPanel, "center");
//    }
//
//        public void addStartButtonListener(ActionListener screenHandler, String actionCommand) {
//            startButton.addActionListener(screenHandler);
//            startButton.setActionCommand(actionCommand);
//        }
//
//
//
//        public JPanel getTitleNamePanel() {
//            return titleNamePanel;
//        }
//
//        public void setTitleNamePanel(JPanel titleNamePanel) {
//            this.titleNamePanel = titleNamePanel;
//        }
//
//        public JPanel getStartButtonPanel() {
//            return startButtonPanel;
//        }
//
//        public void setStartButtonPanel(JPanel startButtonPanel) {
//            this.startButtonPanel = startButtonPanel;
//        }
//
//        public JButton getStartButton() {
//            return startButton;
//        }
//
//        public void setStartButton(JButton startButton) {
//            this.startButton = startButton;
//        }
//
//        public JLabel getTitleLabel() {
//            return titleLabel;
//        }
//
//        public void setTitleLabel(JLabel titleLabel) {
//            this.titleLabel = titleLabel;
//        }
//    }
