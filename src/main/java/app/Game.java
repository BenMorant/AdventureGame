package app;


import controller.AbstractController;
import controller.CalculetteController;
import model.entity.AbstractModel;
import model.entity.Calculator;
import view.Calculette;

public final class Game implements Runnable {

    public static void main(String[] args) {
        new Game().run();


    }

    public static void runGame() {
//        Screen screen = new Screen();
//        GUI gui = new GUI(screen);
//        Controller controller = new Controller(screen, gui);
////        screen.addObserver(gui);
////        screen.setProperty("new");


        AbstractModel calc = new Calculator();
        //Création du contrôleur
        AbstractController controller = new CalculetteController(calc);
        //Création de notre fenêtre avec le contrôleur en paramètre
        Calculette calculette = new Calculette(controller);
        //Ajout de la fenêtre comme observer de notre modèle
        calc.addObserver(calculette);
    }

    @Override
    public void run() {
        runGame();
    }
}
