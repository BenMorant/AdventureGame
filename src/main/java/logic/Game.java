package logic;

import model.items.weapons.Knife;
import model.people.Hero;
import view.GameBoard;


public class Game {

    public static final String TITLE = "L'aventure n'attend pas";

    GameBoard gameBoard;
    private int points;

    private Hero hero;

    public Game(GameBoard parentGameBoard) {
        gameBoard = parentGameBoard;
        hero = new Hero(2, "Loup Ardent", "rambo.jpg", "Seriez vous l'élu ?", new Knife(), null);


    }

    public void increaseHP() {
        hero.setHp(hero.getHp() + 1);
    }

    public void decreaseHP() {
        hero.setHp(hero.getHp() - 1);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }
}
