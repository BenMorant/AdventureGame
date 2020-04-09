package view;

import java.awt.*;

public class HeroPanel extends GamePanel {

    private Font heroPanelFont = new Font("Times New Roman", Font.PLAIN, 22);

    private GameLabel hpLabel;
    private GameLabel hpLabelNumber;
    private GameLabel hpMaxLabel;
    private GameLabel hpMaxLabelNumber;
    private GameLabel weaponLabel;
    private GameLabel weaponLabelName;
    private GameLabel weaponLabelDamageMax;
    private GameLabel weaponLabelDamageMaxNumber;
    private GameLabel abilityLabel;
    private GameLabel strengthLabel;
    private GameLabel mpLabel;
    private GameLabel mpLabelNumber;
    private GameLabel mpMaxLabel;
    private GameLabel mpMaxLabelNumber;
    private GameLabel strengthLabelNumber;
    private GameLabel abilityMaxLabel;
    private GameLabel abilityMaxLabelNumber;
    private GameLabel weaponLabelWear;
    private GameLabel weaponLabelWearNumber;
    private GameLabel weaponLabelWearMaxLabel;
    private GameLabel weaponLabelWearMaxLabelNumber;
    private GameLabel abilityLabelNumber;
    private GameLabel strengthMaxLabel;
    private GameLabel strengthMaxLabelNumber;

    public HeroPanel() {
        super(850, 260, 400, 320);
        setLayout(new GridLayout(12, 2));

        hpLabel = new GameLabel("HP : ", Color.white, heroPanelFont);
        hpLabelNumber = new GameLabel("", Color.white, heroPanelFont);
        hpMaxLabel = new GameLabel("HP Max : ", Color.yellow, heroPanelFont);
        hpMaxLabelNumber = new GameLabel("", Color.yellow, heroPanelFont);
        weaponLabel = new GameLabel("Arme : ", Color.white, heroPanelFont);
        weaponLabelName = new GameLabel("", Color.white, heroPanelFont);
        weaponLabelDamageMax = new GameLabel("Domage Max : ", Color.orange, heroPanelFont);
        weaponLabelDamageMaxNumber = new GameLabel("", Color.orange, heroPanelFont);
        abilityLabel = new GameLabel("Habileté : ", Color.white, heroPanelFont);
        strengthLabel = new GameLabel("Force : ", Color.white, heroPanelFont);
        mpLabel = new GameLabel("MP : ", Color.lightGray, heroPanelFont);
        mpLabelNumber = new GameLabel("", Color.lightGray, heroPanelFont);
        mpMaxLabel = new GameLabel("MP Max: ", Color.darkGray, heroPanelFont);
        mpMaxLabelNumber = new GameLabel("", Color.darkGray, heroPanelFont);
        strengthLabelNumber = new GameLabel("", Color.white, heroPanelFont);
        abilityLabelNumber = new GameLabel("", Color.white, heroPanelFont);
        strengthMaxLabel = new GameLabel("Force Max : ", Color.yellow, heroPanelFont);
        strengthMaxLabelNumber = new GameLabel("", Color.yellow, heroPanelFont);
        abilityMaxLabel = new GameLabel("Habileté Max: ", Color.yellow, heroPanelFont);
        abilityMaxLabelNumber = new GameLabel("", Color.yellow, heroPanelFont);
        weaponLabelWear = new GameLabel("Usure : ", Color.white, heroPanelFont);
        weaponLabelWearNumber = new GameLabel("", Color.white, heroPanelFont);
        weaponLabelWearMaxLabel = new GameLabel("Usure Max : ", Color.white, heroPanelFont);
        weaponLabelWearMaxLabelNumber = new GameLabel("", Color.white, heroPanelFont);

        createHeroPanel();
    }

    public void createHeroPanel() {
        buildHeroPanel();
        setVisible(true);
    }

    private void buildHeroPanel() {

        add(hpLabel);
        add(hpLabelNumber);
        add(hpMaxLabel);
        add(hpMaxLabelNumber);
        add(mpLabel);
        add(mpLabelNumber);
        add(mpMaxLabel);
        add(mpMaxLabelNumber);
        add(weaponLabel);
        add(weaponLabelName);
        add(weaponLabelDamageMax);
        add(weaponLabelDamageMaxNumber);
        add(weaponLabelWear);
        add(weaponLabelWearNumber);
        add(weaponLabelWearMaxLabel);
        add(weaponLabelWearMaxLabelNumber);
        add(strengthLabel);
        add(strengthLabelNumber);
        add(strengthMaxLabel);
        add(strengthMaxLabelNumber);
        add(abilityLabel);
        add(abilityLabelNumber);
        add(abilityMaxLabel);
        add(abilityMaxLabelNumber);

    }
}
