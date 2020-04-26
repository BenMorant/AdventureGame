package app;


import controller.Controller;
import model.entity.screens.Screen;
import view.GUI;

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

        Screen screen = new Screen();
        Controller controller = new Controller(screen);
        GUI gui = new GUI(controller);
        screen.addObserver(gui);


//        AbstractModel calc = new Calculator();
//        //Création du contrôleur
//        AbstractController controller = new CalculetteController(calc);
//        //Création de notre fenêtre avec le contrôleur en paramètre
//        Calculette calculette = new Calculette(controller);
//        //Ajout de la fenêtre comme observer de notre modèle
//        calc.addObserver(calculette);
    }

    @Override
    public void run() {
        runGame();
    }
}
