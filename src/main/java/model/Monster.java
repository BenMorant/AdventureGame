package model;

public class Monster extends People {

    String attackMessage;

    public Monster(int hp, String weapon, String attackMessage) {
        super(hp, weapon);
        this.attackMessage = attackMessage;
    }
}
