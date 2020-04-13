package view;

import javax.swing.*;
import java.awt.*;

public class GameButton extends JButton {

    private final Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);

    public GameButton(String text) {
        super(text);
        setBackground(Color.black);
        setForeground(Color.white);
        setFont(normalFont);
        setFocusPainted(false);

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
