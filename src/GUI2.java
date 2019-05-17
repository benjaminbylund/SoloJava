import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GUI2 {
    public JButton button1;
    //JPanel GUI;
    //private JPanel panel1;
    private JTextField meningenTextField;
    private JTextArea logTextArea;

    /**
     * Constructor for my GUI
     * @param pane
     */
    public GUI2(Container pane) {
        //panel1 = new JPanel(new BorderLayout());

        button1 = new JButton();
        button1.setText("Button");
        button1.setPreferredSize(new Dimension(200, 100));
        pane.add(button1, BorderLayout.NORTH);

        meningenTextField = new JTextField();
        meningenTextField.setText("Meningen");
        pane.add(meningenTextField, BorderLayout.CENTER);

        logTextArea = new JTextArea();
        pane.add(logTextArea, BorderLayout.SOUTH);
        logTextArea.setPreferredSize(new Dimension(600,600));
        logTextArea.setMinimumSize(new Dimension(600,600));

        logTextArea.setText("Log");

        //panel1.add(meningenTextField);
        //panel1.add(button1);
        //panel1.add(logTextArea);



    }

    /*public JPanel getPane() {
        return panel1;
    }*/

    /**
     * Connects the actionlistener to the button
     * @param listenForButton
     */
    void addButtonListener(ActionListener listenForButton) {
        button1.addActionListener(listenForButton);
        System.out.println("kopplat");
    }

    /**
     * Updates textfield and textArea
     * @param text
     */
    public void updateText(String text) {
        System.out.println("update!");
        meningenTextField.setText(text);
        logTextArea.append(text);
    }
}
