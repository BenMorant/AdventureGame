package model.entity.people.monsters;

import model.entity.items.MandragoreClove;

public class Mandragore extends Monster {
    public Mandragore() {
        super(1, "Mandragore", "people/monsters/mandragore.jpg", "une mandragore qui a l'air inoffensif...", 25, 0, 4, "La Mandragore pousse son cri mortel !", 3, new MandragoreClove());
    }

    @Override
    public String toString() {
        return "Mandragore{" +
                "attackMessage='" + attackMessage + '\'' +
                ", stealDifficulty=" + stealDifficulty +
                ", monsterItem=" + monsterItem +
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
