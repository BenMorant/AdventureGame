package model;

public abstract class People {

    protected int hp;
    protected String weapon;


    public People(int hp, String weapon) {
        this.hp = hp;
        this.weapon = weapon;

    }

    public void receiveDamage(int damage) {
        hp -= damage;
    }




    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if (hp < 1) {
            this.hp = 0;
        }
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

}
