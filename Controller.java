import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private GUI2 view;
    private Databas databas;

    public Controller(GUI2 view, Databas databas){
        this.view = view;
        this.databas = databas;
        //view.bump();
        //view.test();
        this.view.addButtonListener(new ButtonListener());
    }

    private void bump() {
        //view.bump();
    }

    class ButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("test");
                String Result = databas.generate();

                System.out.println(Result);
                view.updateText(Result);
            }
    }
}
