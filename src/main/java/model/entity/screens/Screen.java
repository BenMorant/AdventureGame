package model.entity.screens;

public class Screen {

    private TitleScreen titleScreen;
    private MainScreen mainScreen;

    public Screen() {
        addAllScreens();
    }

    public void addAllScreens() {
        titleScreen = new TitleScreen();
        mainScreen = new MainScreen();


    }

    public TitleScreen getTitleScreen() {
        return titleScreen;
    }

    public void setTitleScreen(TitleScreen titleScreen) {
        this.titleScreen = titleScreen;
    }

    public MainScreen getMainScreen() {
        return mainScreen;
    }

    public void setMainScreen(MainScreen mainScreen) {
        this.mainScreen = mainScreen;
    }
}
