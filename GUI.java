import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GUI {
    private JButton button1;
    JPanel GUI;
    private JPanel panel1;
    private JTextField meningenTextField;
    private JTextArea logTextArea;

    public static void main(String[] args) {

    }

    public GUI() {}

    public void createGUI() {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(1000, 800);
    }

    public Container getGUI() {
        return GUI;
    }

    void addButtonListener(ActionListener listenForButton){
        button1.addActionListener(listenForButton);
    }
}
