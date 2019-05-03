import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GUI2 gui = new GUI2();
        JFrame frame = new JFrame();
        frame.add(gui.getPane());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1000, 800);
        //GUI gui = new GUI();
        //gui.createGUI();
        Databas databas = new Databas();
        Controller controller = new Controller(gui, databas);
    }
}
