package view;

import javax.swing.*;
import java.awt.*;

public class GameButton extends JButton {

    private final Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);
   // private ChoiceHandler choiceHandler;

    public GameButton(String text) { //, String actionCommand
        super(text);
        setBackground(Color.black);
        setForeground(Color.white);
        setFont(normalFont);
        setFocusPainted(false);
        // addActionListener(choiceHandler);
        //setActionCommand(actionCommand);
    }

    @Override
    public String toString() {
        return "GameButton{" +
                "normalFont=" + normalFont +
                ", model=" + model +
                ", changeListener=" + changeListener +
                ", actionListener=" + actionListener +
                ", itemListener=" + itemListener +
                ", changeEvent=" + changeEvent +
                ", ui=" + ui +
                ", listenerList=" + listenerList +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}
