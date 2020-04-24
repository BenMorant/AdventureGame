package model.entity.screens;

public class TownGate extends Position {

    public TownGate() {
        //     super("Vous êtes à la Porte de la Cité.\nUn garde est devant vous.\n\nQu'est-ce que vous faîtes ?");
        //   hero.setPosition("townGate");
        storyBlock = "Vous êtes à la Porte de la Cité.\nUn garde est devant vous.\n\nQu'est-ce que vous faîtes ?";
        choices = populateStringArray(4, "Parler au garde", "Attaquer le garde", "Partir", "");

    }
}
