package view;

import model.people.Hero;

import java.awt.*;

public class HeroPanel extends GamePanel {

    private Hero hero;

    private final Font heroPanelFont = new Font("Times New Roman", Font.PLAIN, 22);

    private final GameLabel hpLabel;
    private final GameLabel hpLabelNumber;
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

    public HeroPanel(Hero hero) {
        super(850, 260, 400, 320);
        setLayout(new GridLayout(12, 2));


        hpLabel = new GameLabel("HP : ", Color.white, heroPanelFont);
        hpLabelNumber = new GameLabel(String.valueOf(hero.getHp()), Color.white, heroPanelFont);
//        hpMaxLabel = new GameLabel("HP Max : ", Color.yellow, heroPanelFont);
//        hpMaxLabelNumber = new GameLabel("", Color.yellow, heroPanelFont);
//        weaponLabel = new GameLabel("Arme : ", Color.white, heroPanelFont);
//        weaponLabelName = new GameLabel("", Color.white, heroPanelFont);
//        weaponLabelDamageMax = new GameLabel("Domage Max : ", Color.orange, heroPanelFont);
//        weaponLabelDamageMaxNumber = new GameLabel("", Color.orange, heroPanelFont);
//        abilityLabel = new GameLabel("Habileté : ", Color.white, heroPanelFont);
//        strengthLabel = new GameLabel("Force : ", Color.white, heroPanelFont);
//        mpLabel = new GameLabel("MP : ", Color.lightGray, heroPanelFont);
//        mpLabelNumber = new GameLabel("", Color.lightGray, heroPanelFont);
//        mpMaxLabel = new GameLabel("MP Max: ", Color.darkGray, heroPanelFont);
//        mpMaxLabelNumber = new GameLabel("", Color.darkGray, heroPanelFont);
//        strengthLabelNumber = new GameLabel("", Color.white, heroPanelFont);
//        abilityLabelNumber = new GameLabel("", Color.white, heroPanelFont);
//        strengthMaxLabel = new GameLabel("Force Max : ", Color.yellow, heroPanelFont);
//        strengthMaxLabelNumber = new GameLabel("", Color.yellow, heroPanelFont);
//        abilityMaxLabel = new GameLabel("Habileté Max: ", Color.yellow, heroPanelFont);
//        abilityMaxLabelNumber = new GameLabel("", Color.yellow, heroPanelFont);
//        weaponLabelWear = new GameLabel("Usure : ", Color.white, heroPanelFont);
//        weaponLabelWearNumber = new GameLabel("", Color.white, heroPanelFont);
//        weaponLabelWearMaxLabel = new GameLabel("Usure Max : ", Color.white, heroPanelFont);
//        weaponLabelWearMaxLabelNumber = new GameLabel("", Color.white, heroPanelFont);

        createHeroPanel();
    }

    public void createHeroPanel() {
        buildHeroPanel();
        setVisible(true);
    }

    private void buildHeroPanel() {

        add(hpLabel);
        add(hpLabelNumber);
//        add(hpMaxLabel);
//        add(hpMaxLabelNumber);
//        add(mpLabel);
//        add(mpLabelNumber);
//        add(mpMaxLabel);
//        add(mpMaxLabelNumber);
//        add(weaponLabel);
//        add(weaponLabelName);
//        add(weaponLabelDamageMax);
//        add(weaponLabelDamageMaxNumber);
//        add(weaponLabelWear);
//        add(weaponLabelWearNumber);
//        add(weaponLabelWearMaxLabel);
//        add(weaponLabelWearMaxLabelNumber);
//        add(strengthLabel);
//        add(strengthLabelNumber);
//        add(strengthMaxLabel);
//        add(strengthMaxLabelNumber);
//        add(abilityLabel);
//        add(abilityLabelNumber);
//        add(abilityMaxLabel);
//        add(abilityMaxLabelNumber);

    }

    public Font getHeroPanelFont() {
        return heroPanelFont;
    }

    public GameLabel getHpLabel() {
        return hpLabel;
    }

    public GameLabel getHpLabelNumber() {
        return hpLabelNumber;
    }

    public GameLabel getHpMaxLabel() {
        return hpMaxLabel;
    }

    public void setHpMaxLabel(GameLabel hpMaxLabel) {
        this.hpMaxLabel = hpMaxLabel;
    }

    public GameLabel getHpMaxLabelNumber() {
        return hpMaxLabelNumber;
    }

    public void setHpMaxLabelNumber(GameLabel hpMaxLabelNumber) {
        this.hpMaxLabelNumber = hpMaxLabelNumber;
    }

    public GameLabel getWeaponLabel() {
        return weaponLabel;
    }

    public void setWeaponLabel(GameLabel weaponLabel) {
        this.weaponLabel = weaponLabel;
    }

    public GameLabel getWeaponLabelName() {
        return weaponLabelName;
    }

    public void setWeaponLabelName(GameLabel weaponLabelName) {
        this.weaponLabelName = weaponLabelName;
    }

    public GameLabel getWeaponLabelDamageMax() {
        return weaponLabelDamageMax;
    }

    public void setWeaponLabelDamageMax(GameLabel weaponLabelDamageMax) {
        this.weaponLabelDamageMax = weaponLabelDamageMax;
    }

    public GameLabel getWeaponLabelDamageMaxNumber() {
        return weaponLabelDamageMaxNumber;
    }

    public void setWeaponLabelDamageMaxNumber(GameLabel weaponLabelDamageMaxNumber) {
        this.weaponLabelDamageMaxNumber = weaponLabelDamageMaxNumber;
    }

    public GameLabel getAbilityLabel() {
        return abilityLabel;
    }

    public void setAbilityLabel(GameLabel abilityLabel) {
        this.abilityLabel = abilityLabel;
    }

    public GameLabel getStrengthLabel() {
        return strengthLabel;
    }

    public void setStrengthLabel(GameLabel strengthLabel) {
        this.strengthLabel = strengthLabel;
    }

    public GameLabel getMpLabel() {
        return mpLabel;
    }

    public void setMpLabel(GameLabel mpLabel) {
        this.mpLabel = mpLabel;
    }

    public GameLabel getMpLabelNumber() {
        return mpLabelNumber;
    }

    public void setMpLabelNumber(GameLabel mpLabelNumber) {
        this.mpLabelNumber = mpLabelNumber;
    }

    public GameLabel getMpMaxLabel() {
        return mpMaxLabel;
    }

    public void setMpMaxLabel(GameLabel mpMaxLabel) {
        this.mpMaxLabel = mpMaxLabel;
    }

    public GameLabel getMpMaxLabelNumber() {
        return mpMaxLabelNumber;
    }

    public void setMpMaxLabelNumber(GameLabel mpMaxLabelNumber) {
        this.mpMaxLabelNumber = mpMaxLabelNumber;
    }

    public GameLabel getStrengthLabelNumber() {
        return strengthLabelNumber;
    }

    public void setStrengthLabelNumber(GameLabel strengthLabelNumber) {
        this.strengthLabelNumber = strengthLabelNumber;
    }

    public GameLabel getAbilityMaxLabel() {
        return abilityMaxLabel;
    }

    public void setAbilityMaxLabel(GameLabel abilityMaxLabel) {
        this.abilityMaxLabel = abilityMaxLabel;
    }

    public GameLabel getAbilityMaxLabelNumber() {
        return abilityMaxLabelNumber;
    }

    public void setAbilityMaxLabelNumber(GameLabel abilityMaxLabelNumber) {
        this.abilityMaxLabelNumber = abilityMaxLabelNumber;
    }

    public GameLabel getWeaponLabelWear() {
        return weaponLabelWear;
    }

    public void setWeaponLabelWear(GameLabel weaponLabelWear) {
        this.weaponLabelWear = weaponLabelWear;
    }

    public GameLabel getWeaponLabelWearNumber() {
        return weaponLabelWearNumber;
    }

    public void setWeaponLabelWearNumber(GameLabel weaponLabelWearNumber) {
        this.weaponLabelWearNumber = weaponLabelWearNumber;
    }

    public GameLabel getWeaponLabelWearMaxLabel() {
        return weaponLabelWearMaxLabel;
    }

    public void setWeaponLabelWearMaxLabel(GameLabel weaponLabelWearMaxLabel) {
        this.weaponLabelWearMaxLabel = weaponLabelWearMaxLabel;
    }

    public GameLabel getWeaponLabelWearMaxLabelNumber() {
        return weaponLabelWearMaxLabelNumber;
    }

    public void setWeaponLabelWearMaxLabelNumber(GameLabel weaponLabelWearMaxLabelNumber) {
        this.weaponLabelWearMaxLabelNumber = weaponLabelWearMaxLabelNumber;
    }

    public GameLabel getAbilityLabelNumber() {
        return abilityLabelNumber;
    }

    public void setAbilityLabelNumber(GameLabel abilityLabelNumber) {
        this.abilityLabelNumber = abilityLabelNumber;
    }

    public GameLabel getStrengthMaxLabel() {
        return strengthMaxLabel;
    }

    public void setStrengthMaxLabel(GameLabel strengthMaxLabel) {
        this.strengthMaxLabel = strengthMaxLabel;
    }

    public GameLabel getStrengthMaxLabelNumber() {
        return strengthMaxLabelNumber;
    }

    public void setStrengthMaxLabelNumber(GameLabel strengthMaxLabelNumber) {
        this.strengthMaxLabelNumber = strengthMaxLabelNumber;
    }

    @Override
    public String toString() {
        return "HeroPanel{" +
                "heroPanelFont=" + heroPanelFont +
                ", hpLabel=" + hpLabel +
                ", hpLabelNumber=" + hpLabelNumber +
                ", hpMaxLabel=" + hpMaxLabel +
                ", hpMaxLabelNumber=" + hpMaxLabelNumber +
                ", weaponLabel=" + weaponLabel +
                ", weaponLabelName=" + weaponLabelName +
                ", weaponLabelDamageMax=" + weaponLabelDamageMax +
                ", weaponLabelDamageMaxNumber=" + weaponLabelDamageMaxNumber +
                ", abilityLabel=" + abilityLabel +
                ", strengthLabel=" + strengthLabel +
                ", mpLabel=" + mpLabel +
                ", mpLabelNumber=" + mpLabelNumber +
                ", mpMaxLabel=" + mpMaxLabel +
                ", mpMaxLabelNumber=" + mpMaxLabelNumber +
                ", strengthLabelNumber=" + strengthLabelNumber +
                ", abilityMaxLabel=" + abilityMaxLabel +
                ", abilityMaxLabelNumber=" + abilityMaxLabelNumber +
                ", weaponLabelWear=" + weaponLabelWear +
                ", weaponLabelWearNumber=" + weaponLabelWearNumber +
                ", weaponLabelWearMaxLabel=" + weaponLabelWearMaxLabel +
                ", weaponLabelWearMaxLabelNumber=" + weaponLabelWearMaxLabelNumber +
                ", abilityLabelNumber=" + abilityLabelNumber +
                ", strengthMaxLabel=" + strengthMaxLabel +
                ", strengthMaxLabelNumber=" + strengthMaxLabelNumber +
                '}';
    }
}
