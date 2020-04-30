package view.interfaces;

public interface GameFrameInterface {

    public void displayFrameTitle(String frameTitle);
    public void setMinimalFrameSize(int width, int height);
    public void setFrameFullScreen();
    public void setFrameDefaultPositionToCenter();
    public void setDefaultBackgroundColorToBlack();
    public void setCloseBehavior();
    public void setResizableFrame();

}
