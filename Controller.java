import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private GUI view;
    private Databas databas;

    public Controller(GUI view, Databas databas){
        this.view = view;
        this.databas = databas;

        this.view.addButtonListener(new ButtonListener());
    }

        private class ButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        }
}
