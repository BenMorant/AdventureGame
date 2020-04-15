package logic;

import model.entity.items.weapons.Knife;
import model.entity.people.Hero;
import view.Window;


public class Game {

    public static final String TITLE = "L'aventure n'attend pas";

    Window window;
    private int points;

    private final Hero hero;

    public Game(Window parentWindow) {
        window = parentWindow;
        hero = new Hero(2, "Loup Ardent", "rambo.jpg", "Seriez vous l'élu ?", new Knife(), null);


    }
}
