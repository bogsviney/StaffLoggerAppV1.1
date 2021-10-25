import GUI.AppGUI;
import tests.Test;

public class Main {
    public static void main(String[] args) {
        AppGUI app = new AppGUI();
        app.setVisible(true);
        new Test();
    }
}
