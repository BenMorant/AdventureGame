package model.people;

import model.items.Item;
import model.items.weapons.Weapon;
import model.utils.ModelHelper;

public class Hero extends People {

    private int hpMax = 0;
    private int mpMax = 0;
    private int ability = 0;
    private int abilityMax = 0;
    private int strengthMax = 0;
    private Weapon currentWeapon = null;
    private Item currentItem = null;
    private String position;

    public Hero(int gender, String name, String image, String description, Weapon currentWeapon, Item currentItem) {
        super(gender, name, image, description, 0, 0, 0);
        this.strengthMax = ModelHelper.getRandomNumberBetweenTwoBounds(0, 10);
        this.hpMax = ModelHelper.getRandomNumberBetweenTwoBounds(7, 15);
        this.mpMax = ModelHelper.getRandomNumberBetweenTwoBounds(0, 0);
        this.abilityMax = 10 - this.strengthMax;
        this.hp = this.hpMax;
        this.mp = this.mpMax;
        this.strength = this.strengthMax;
        this.ability = this.abilityMax;
        this.currentWeapon = currentWeapon;
        this.currentItem = currentItem;
        this.image = "./src/main/resources/pix/people/hero/" + image;
        this.position = null;
    }

    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public int getMpMax() {
        return mpMax;
    }

    public void setMpMax(int mpMax) {
        this.mpMax = mpMax;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    public int getAbilityMax() {
        return abilityMax;
    }

    public void setAbilityMax(int abilityMax) {
        this.abilityMax = abilityMax;
    }

    public int getStrengthMax() {
        return strengthMax;
    }

    public void setStrengthMax(int strengthMax) {
        this.strengthMax = strengthMax;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public Item getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(Item currentItem) {
        this.currentItem = currentItem;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //TODO : rework these 4 methods

    public void receiveDamage(int damage) {
        hp -= damage;
    }

    public void receiveHealing(int healing) {
        hp += healing;
    }

    public void movePosition(String position) {
        this.position = position;
    }

    public void equipWeapon(Weapon weapon) {
        this.currentWeapon = weapon;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "hpMax=" + hpMax +
                ", mpMax=" + mpMax +
                ", ability=" + ability +
                ", abilityMax=" + abilityMax +
                ", strengthMax=" + strengthMax +
                ", currentWeapon=" + currentWeapon +
                ", currentItem=" + currentItem +
                ", hp=" + hp +
                ", mp=" + mp +
                ", strength=" + strength +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
