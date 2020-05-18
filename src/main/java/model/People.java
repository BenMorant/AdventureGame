package model;

public class People {

    private Integer hp;
    private String weapon;
    private String picture;
    private String attackMessage;
    private boolean silverRing;

    public People() {

    }

    public void initMonster(Integer hp, String weapon, String attackMessage) {
        this.hp = hp;
        this.weapon = weapon;
        this.attackMessage = attackMessage;
    }


    public void receiveDamage(int damage) {
        hp -= damage;
    }

    public void receiveHealing(int healing) {
        hp += healing;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }


    public String getAttackMessage() {
        return attackMessage;
    }

    public void setAttackMessage(String attackMessage) {
        this.attackMessage = attackMessage;
    }

    public boolean hasSilverRing() {
        return silverRing;
    }
}
