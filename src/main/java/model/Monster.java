package model;

public class Monster extends People {

    String attackMessage;

    public Monster(int hp, String weapon, String attackMessage) {
        super();
        this.hp = hp;
        this.weapon = weapon;
        this.attackMessage = attackMessage;
    }
}
