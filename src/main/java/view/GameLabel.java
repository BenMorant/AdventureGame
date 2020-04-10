package view;

import javax.swing.*;
import java.awt.*;

public class GameLabel extends JLabel {

    public GameLabel(String text, Color foregroundColor, Font font) {
        super(text);
        setForeground(foregroundColor);
        setFont(font);

    }

    @Override
    public String toString() {
        return "GameLabel{" +
                "labelFor=" + labelFor +
                ", ui=" + ui +
                ", listenerList=" + listenerList +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}
