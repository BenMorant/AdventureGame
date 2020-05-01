package view.interfaces;

public interface GameFrameInterface {
    public void authorizeCustomWindowDecoration();
    public void displayFrameTitle(String frameTitle);
    public void setMinimalFrameSize(int width, int height);
    public void setFrameFullScreen();
    public void setFrameDefaultPositionToCenter();
    public void setCloseBehavior();
    public void setResizableFrame();


}
