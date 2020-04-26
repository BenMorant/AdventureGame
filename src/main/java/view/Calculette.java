package view;

import controller.AbstractController;
import observer.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculette extends GameFrame implements Observer {

    private final JPanel mainGamePanel = new JPanel();

    private final String operateur = "";
    //L'instance de notre objet contrôleur
    private final AbstractController controller;
    String[] choicesString = {"choix 1", "choix 2", "choix 3", "choix 4"};
    JButton[] choicesButton = new JButton[choicesString.length];
    private JLabel heroHpLabel = new JLabel("Hero HP = ");
    private JTextArea mainTextArea;
    private double chiffre1;

    public Calculette(AbstractController controller) {
        initComposant();
        this.controller = controller;
        this.setContentPane(mainGamePanel);
        this.setVisible(true);
    }

    //Implémentation du pattern observer
    public void update(String str) {
        mainTextArea.setText(str);
//        HeroHpLabel.setText(str);
    }

    @Override
    public void update(int number) {

    }


    //Les listeners pour nos boutons
    class ChoiceListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //On affiche le chiffre en plus dans le label
            String str = ((JButton) e.getSource()).getText();

            controller.setNombre(((JButton) e.getSource()).getText());
        }
    }

    class OperateurListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            controller.setOperateur(((JButton) e.getSource()).getText());
        }
    }

    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            controller.reset();
        }
    }

    private void initComposant() {
        heroHpLabel = new JLabel("0");
        heroHpLabel.setHorizontalAlignment(JLabel.RIGHT);
        heroHpLabel.setPreferredSize(new Dimension(220, 20));
        mainTextArea = new GameTextArea("yo", 40, 650, 500, 300);
        JPanel heroPanel = new JPanel();
        heroPanel.setPreferredSize(new Dimension(155, 265));
        heroPanel.setBackground(Color.red);
        heroPanel.add(heroHpLabel);
        JPanel choiceButtonsPanel = new JPanel();
        choiceButtonsPanel.setPreferredSize(new Dimension(265, 265));
        choiceButtonsPanel.setBackground(Color.yellow);
        JPanel mainTextPanel = new JPanel();
        mainTextPanel.setPreferredSize(new Dimension(500, 300));
        mainTextPanel.setBackground(Color.green);

        //Nous utiliserons le même listener pour tous les opérateurs
        OperateurListener opeListener = new OperateurListener();

//        for (int i = 0; i < tab_string.length; i++) {
//            tab_button[i] = new JButton(tab_string[i]);
//            tab_button[i].setPreferredSize(dim);
//
//            switch (i) {
//                case 11:
//                    tab_button[i].addActionListener(opeListener);
//                    choiceButtonsPanel.add(tab_button[i]);
//                    break;
//                case 12:
//                    tab_button[i].setForeground(Color.red);
//                    tab_button[i].addActionListener(new ResetListener());
//                    tab_button[i].setPreferredSize(dim2);
//                    heroPanel.add(tab_button[i]);
//                    break;
//                case 13:
//                case 14:
//                case 15:
//                case 16:
//                    tab_button[i].setForeground(Color.red);
//                    tab_button[i].addActionListener(opeListener);
//                    tab_button[i].setPreferredSize(dim2);
//                    heroPanel.add(tab_button[i]);
//                    break;
//                default:
//                    choiceButtonsPanel.add(tab_button[i]);
//                    tab_button[i].addActionListener(new ChiffreListener());
//                    break;
//            }
//        }

        for (int i = 0; i < choicesString.length; i++) {
            choicesButton[i] = new JButton(choicesString[i]);
            choicesButton[i].addActionListener(new ChoiceListener());
            choiceButtonsPanel.add(choicesButton[i]);
//            switch (i) {
//                case 1:
//                    choicesButton[i].addActionListener(opeListener);
//                    choiceButtonsPanel.add(choicesButton[i]);
//                    break;
//                case 12:
//                    choicesButton[i].setForeground(Color.red);
//                    choicesButton[i].addActionListener(new ResetListener());
//                    choicesButton[i].setPreferredSize(dim2);
//                    heroPanel.add(choicesButton[i]);
//                    break;
//                case 13:
//                case 14:
//                case 15:
//                case 16:
//                    choicesButton[i].setForeground(Color.red);
//                    choicesButton[i].addActionListener(opeListener);
//                    choicesButton[i].setPreferredSize(dim2);
//                    heroPanel.add(choicesButton[i]);
//                    break;
//                default:
//                    choiceButtonsPanel.add(choicesButton[i]);
//                    choicesButton[i].addActionListener(new ChiffreListener());
//                    break;
//            }
        }
//        mainTextPanel.add(mainTextLabel);
        mainTextPanel.add(mainTextArea);
        mainTextPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        mainGamePanel.add(mainTextPanel, BorderLayout.NORTH);
        mainGamePanel.add(choiceButtonsPanel, BorderLayout.CENTER);
        mainGamePanel.add(heroPanel, BorderLayout.EAST);
        mainGamePanel.setBackground(Color.gray);
    }
}
