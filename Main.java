public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.createGUI();
        Databas databas = new Databas();
        Controller controller = new Controller(gui, databas);
    }
}
