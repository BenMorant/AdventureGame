package model.entity.people;

import model.entity.GenericModelEntity;

public class People extends GenericModelEntity {

    private int hp = 0;
    private int mp = 0;
    private int strength = 0;


    public People(int gender, String name, String image, String description, int hp, int mp, int strength) {
        super(gender, name, image, description);
        this.image = "./src/main/resources/pix/people/" + image;
        this.hp = hp;
        this.mp = mp;
        this.strength = strength;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "People{" +
                "hp=" + hp +
                ", mp=" + mp +
                ", strength=" + strength +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
