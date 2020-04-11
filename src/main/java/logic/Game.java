package logic;

import model.items.weapons.Knife;
import model.people.Hero;
import view.GameBoard;


public class Game {

    public static final String TITLE = "L'aventure n'attend pas";

    GameBoard gameBoard;
    private int points;

    private final Hero hero;

    public Game(GameBoard parentGameBoard) {
        gameBoard = parentGameBoard;
        hero = new Hero(2, "Loup Ardent", "rambo.jpg", "Seriez vous l'élu ?", new Knife(), null);


    }
}
