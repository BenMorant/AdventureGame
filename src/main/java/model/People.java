package model;

public class People {

    private int hp;
    private String weapon;


    public People(int currentHp, String currentWeapon) {
        this.hp = currentHp;
        this.weapon = currentWeapon;

    }

    public void getDamage(int damage) {
        hp -= damage;
    }

    public void getHealing(int healing) {
        hp += healing;
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
