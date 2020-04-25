package controller;

import model.entity.AbstractModel;

import java.util.ArrayList;


public abstract class AbstractController {

    protected AbstractModel calc;
    protected String operateur = "";
    protected String choice = "";
    protected ArrayList<String> listOperateur = new ArrayList<String>();

    public AbstractController(AbstractModel cal) {
        this.calc = cal;
        //On définit la liste des opérateurs
        //Afin de s'assurer qu'ils sont corrects
        this.listOperateur.add("+");
        this.listOperateur.add("-");
        this.listOperateur.add("*");
        this.listOperateur.add("/");
        this.listOperateur.add("=");
    }

    //Définit l'opérateur
    public void setOperateur(String ope) {
        this.operateur = ope;
        control();
    }

    //Définit le nombre
    public void setChoice(String choice) {
        this.choice = choice;
        control();
    }

    //Efface
    public void reset() {
        this.calc.reset();
    }

    //Méthode de contrôle
    abstract void control();
}
