package model;

public class People {

    private int currentHp;
    private String currentWeapon;


    public People(int currentHp, String currentWeapon) {
        this.currentHp = currentHp;
        this.currentWeapon = currentWeapon;

    }

    public void getDamage(int damage) {
        currentHp -= damage;
    }

    public void getHealing(int healing) {
        currentHp += healing;
    }


    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
        if (currentHp < 1) {
            this.currentHp = 0;
        }
    }

    public String getCurrentWeapon() {
        return currentWeapon;
    }

    public void setCurrentWeapon(String weapon) {
        this.currentWeapon = weapon;
    }

}
