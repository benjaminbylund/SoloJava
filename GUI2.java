import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GUI2 {
    public JButton button1;
    //JPanel GUI;
    private JPanel panel1;
    private JTextField meningenTextField;
    private JTextArea logTextArea;

    public GUI2() {
        panel1 = new JPanel();
        button1 = new JButton();
        button1.setText("Button");
        meningenTextField = new JTextField();
        meningenTextField.setText("Meningen");
        logTextArea = new JTextArea();
        logTextArea.setText("Log");
        panel1.add(meningenTextField);
        panel1.add(button1);
        panel1.add(logTextArea);

    }

    public JPanel getPane() {
        return panel1;
    }

    void addButtonListener(ActionListener listenForButton) {
        button1.addActionListener(listenForButton);
        System.out.println("kopplat");
    }

    public void updateText(String text) {
        System.out.println("update!");
        meningenTextField.setText(text);
        logTextArea.setText(text);
    }
}
