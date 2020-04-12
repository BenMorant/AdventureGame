package logic;

import model.items.weapons.Knife;
import model.items.weapons.Weapon;
import model.people.Hero;
import view.GUI;

public final class GameWorld {

    private final GUI gui;

    private final Hero hero = new Hero(2, "Loup Ardent", "rambo.jpg", "Seriez vous l'élu ?", new Knife(), null);

    // private final Player hero = new Player(15, "Knife");
    private boolean silverRing = false;
    private int goblinHP = 20;

    public GameWorld(GUI gui) {
        this.gui = gui;
    }

    public String getHeroPosition() {
        return this.hero.getPosition();
    }

    public boolean playerHasSilverRing() {
        if (this.silverRing) {
            gui.updateMainTextArea("Garde : Oh vous avez tué ce gobelin ?\nMerci du fond du coeur. Vous êtes un véritable héros !\nBienvenue dans notre ville !\n\n<FIN>");
            gui.hideChoiceButtons();
        }
        return silverRing;
    }

    public boolean playerIsAlive() {
        boolean isAlive = hero.getHp() > 0;

        if (!isAlive) {
            gui.updateMainTextArea("Vous êtes mort !\n\n<GAME OVER>");
            gui.hideChoiceButtons();
        }
        return isAlive;
    }

    public boolean goblinIsAlive() {
        boolean isAlive = goblinHP > 0;

        if (!isAlive) {
            hero.movePosition("playedKilledGoblin");

            gui.updateMainTextArea("Vous avez vaincu le gobelin !\nLa gobelin a jeté un anneau !\n\n(Vous avez obtenu un anneau d'argent)");
            gui.updateChoiceButtons("Aller à l'Est", "", "", "");

            silverRing = true;
        }
        return isAlive;
    }

    public void startGame() {
        gui.updateCurrentHPLabel(hero.getHp());
        gui.updateCurrentWeaponLabel(hero.getCurrentWeapon());

        townGate();
    }

    public void townGate() {
        hero.movePosition("townGate");

        gui.updateMainTextArea("Vous êtes à la Porte de la Cité.\nUn garde est devant vous.\n\nQu'est-ce que vous faîtes ?");
        gui.updateChoiceButtons("Parler au garde", "Attaquer le garde", "Partir", "");
    }

    public void talkToGuard() {
        hero.movePosition("playerTalkedToGuard");

        gui.updateMainTextArea("Garde: Bonjour Etranger. Je n'ai jamais vu votre tête.\nJe suis désolé mais je ne peux pas laisser un étranger entrer dans notre Cité .");
        gui.updateChoiceButtonsNoActions();
    }

    public void attackGuard() {
        hero.movePosition("playerAttackedGuard");

        gui.updateMainTextArea("Garde: Hey ! Ne soyez pas stupide !\n\nLe garde attaque en retour et vous frappe fort.\n(Vous recevez 3 points de dommage)");
        gui.updateChoiceButtonsNoActions();

        updatePlayerHP(3, true);
    }

    public void crossRoad() {
        hero.movePosition("crossRoad");

        gui.updateMainTextArea("Vous êtes à un carrefour.\nSi vous allez au Sud, vous serez de retour à la Cité.");
        gui.updateChoiceButtons("Aller au Nord", "Aller à l'Est", "Aller au Sud", "Allez à l'Ouest");
    }

    public void north() {
        hero.movePosition("north");

        gui.updateMainTextArea("Il y a une rivière.\nVous buvez l'eau et vous vous reposez sur le rivage.\n(Vos points de vie sont recouvrés +2)");
        gui.updateChoiceButtons("Aller au Sud", "", "", "");

        updatePlayerHP(2, false);
    }

    public void east() {
        hero.movePosition("east");

        gui.updateMainTextArea("Vous marchez dans la forêt et trouvez une longue épée!\n\n(Vous obbtenez une Longue Epée)");
        gui.updateChoiceButtons("Aller à l'Ouest", "", "", "");

        updatePlayerWeapon("Long Sword");
    }

    public void west() {
        hero.movePosition("west");

        if (goblinHP > 0) {
            gui.updateMainTextArea("Vous rencontrez un Gobelin !");
            gui.updateChoiceButtons("Combattre", "Fuir", "", "");
        } else {
            gui.updateMainTextArea("Il y a un Gobelin mort sur le sol.");
            gui.updateChoiceButtonsNoActions();
        }
    }

    public void fightGoblin() {
        hero.movePosition("goblinBattle");

        gui.updateMainTextArea("HP du Gobelin : " + goblinHP + "\n\nQue faîtes vous ?");
        gui.updateChoiceButtons("Combattre", "Fuir", "", "");
    }

    public void attackGoblin() {
        hero.movePosition("playerAttackedGoblin");

        int playerDamage = 0;
        if (hero.getCurrentWeapon().getName().equals("Knife")) {
            playerDamage = new java.util.Random().nextInt(3);
        } else if (hero.getCurrentWeapon().getName().equals("Long Sword")) {
            playerDamage = new java.util.Random().nextInt(10);
        }

        gui.updateMainTextArea("Vous attaquez le Gobelin et lui donnez " + playerDamage + " points de dommage !");
        gui.updateChoiceButtonsNoActions();

        goblinHP -= playerDamage;
    }

    public void goblinAttacks() {
        hero.movePosition("goblinAttackedPlayer");

        int goblinDamage = new java.util.Random().nextInt(6);

        gui.updateMainTextArea("Le Gobelin vous attaque et vous donne " + goblinDamage + " points de dommage !");
        gui.updateChoiceButtonsNoActions();

        updatePlayerHP(goblinDamage, true);
    }

    private void updatePlayerHP(int hp, boolean isDamage) {
        if (isDamage) {
            hero.receiveDamage(hp);
        } else {
            hero.receiveHealing(hp);
        }
        gui.updateCurrentHPLabel(hero.getHp());
    }

    private void updatePlayerWeapon(Weapon weapon) {
        hero.equipWeapon(weapon);
        gui.updateCurrentWeaponLabel(weapon);
    }

}
