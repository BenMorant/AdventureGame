package model;

public class People {

    private Integer hp;
    private String weapon;


    public void receiveDamage(int damage) {
        hp -= damage;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
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
