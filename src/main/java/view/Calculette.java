package view;

import controller.AbstractController;
import observer.Observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculette extends GameFrame implements Observer {

    private final JPanel container = new JPanel();
    private final HeroPanel heroPanel = new HeroPanel();
    private final ChoiceButtonPanel choiceButtonPanel = new ChoiceButtonPanel();
    private final MainTextPanel mainTextPanel = new MainTextPanel();
    private final Dimension dim = new Dimension(50, 40);
    private final Dimension dim2 = new Dimension(50, 31);
    private final boolean clicOperateur = false;
    private final boolean update = false;
    private final String operateur = "";
    //L'instance de notre objet contrôleur
    private final AbstractController controller;
    //    String[] tab_string = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "=", "C", "+", "-", "*", "/"};
    String[] choicesString = {"choix 1", "choix 2", "choix 3", "choix 4"};
    //    JButton[] choicesButton = new JButton[tab_string.length];
    JButton[] choicesButton = new JButton[choicesString.length];
    private JLabel ecran = new JLabel();
    private double chiffre1;

    public Calculette(AbstractController controller) {
        //  this.setSize(240, 260);
        //  this.setTitle("Calculette");
        //    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //  this.setLocationRelativeTo(null);
        //     this.setResizable(false);
        initComposant();
        this.controller = controller;
        this.setContentPane(container);
        this.setVisible(true);
    }

    //Implémentation du pattern observer
    public void update(String str) {
        ecran.setText(str);
    }

    //Les listeners pour nos boutons
    class ChiffreListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //On affiche le chiffre en plus dans le label
            String str = ((JButton) e.getSource()).getText();
            if (!ecran.getText().equals("0"))
                str = ecran.getText() + str;

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
        //    Font police = new Font("Arial", Font.BOLD, 20);
        ecran = new JLabel("0");
        //  ecran.setFont(police);
        ecran.setHorizontalAlignment(JLabel.RIGHT);
        ecran.setPreferredSize(new Dimension(220, 20));

        JPanel operateur = new JPanel();
        operateur.setPreferredSize(new Dimension(55, 225));
        JPanel chiffre = new JPanel();
        chiffre.setPreferredSize(new Dimension(165, 225));
        JPanel panEcran = new JPanel();
        panEcran.setPreferredSize(new Dimension(220, 30));

        //Nous utiliserons le même listener pour tous les opérateurs
        OperateurListener opeListener = new OperateurListener();

//        for (int i = 0; i < tab_string.length; i++) {
//            tab_button[i] = new JButton(tab_string[i]);
//            tab_button[i].setPreferredSize(dim);
//
//            switch (i) {
//                case 11:
//                    tab_button[i].addActionListener(opeListener);
//                    chiffre.add(tab_button[i]);
//                    break;
//                case 12:
//                    tab_button[i].setForeground(Color.red);
//                    tab_button[i].addActionListener(new ResetListener());
//                    tab_button[i].setPreferredSize(dim2);
//                    operateur.add(tab_button[i]);
//                    break;
//                case 13:
//                case 14:
//                case 15:
//                case 16:
//                    tab_button[i].setForeground(Color.red);
//                    tab_button[i].addActionListener(opeListener);
//                    tab_button[i].setPreferredSize(dim2);
//                    operateur.add(tab_button[i]);
//                    break;
//                default:
//                    chiffre.add(tab_button[i]);
//                    tab_button[i].addActionListener(new ChiffreListener());
//                    break;
//            }
//        }

        for (int i = 0; i < choicesString.length; i++) {
            choicesButton[i] = new JButton(choicesString[i]);
            choicesButton[i].addActionListener(opeListener);
            chiffre.add(choicesButton[i]);
//            switch (i) {
//                case 1:
//                    choicesButton[i].addActionListener(opeListener);
//                    chiffre.add(choicesButton[i]);
//                    break;
//                case 12:
//                    choicesButton[i].setForeground(Color.red);
//                    choicesButton[i].addActionListener(new ResetListener());
//                    choicesButton[i].setPreferredSize(dim2);
//                    operateur.add(choicesButton[i]);
//                    break;
//                case 13:
//                case 14:
//                case 15:
//                case 16:
//                    choicesButton[i].setForeground(Color.red);
//                    choicesButton[i].addActionListener(opeListener);
//                    choicesButton[i].setPreferredSize(dim2);
//                    operateur.add(choicesButton[i]);
//                    break;
//                default:
//                    chiffre.add(choicesButton[i]);
//                    choicesButton[i].addActionListener(new ChiffreListener());
//                    break;
//            }
        }
        panEcran.add(ecran);
        panEcran.setBorder(BorderFactory.createLineBorder(Color.black));
        container.add(panEcran, BorderLayout.NORTH);
        container.add(chiffre, BorderLayout.CENTER);
        container.add(operateur, BorderLayout.EAST);
    }
}
