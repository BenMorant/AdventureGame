package model;

public class People {

    int currentHp;

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
        if (currentHp < 1) {
            this.currentHp = 0;
        }
    }
}
