import view.FrameContainer;
import view.MainFrame;

public class Main {
    public static void main(String[] args) {
        Injector injector = new Injector();

        FrameContainer frameContainer = injector.initialize();
        frameContainer.getEnterFrame().setVisible(true);

    }
}
