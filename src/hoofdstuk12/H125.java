package hoofdstuk12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/**
 * Created by denni_000 on 7-11-2016.
 */
public class H125 extends Applet {
    TextField text1;
    Button knop;

    boolean gevonden;
    double myArray[] = {0.0, 100.0, 200.0, 300.0, 400.0, 500.0, 600.0, 700.0, 800.0, 900.0};
    double gezocht;

    public void init() {
        text1 = new TextField("", 10);
        knop = new Button("Ok");

        add(text1);
        add(knop);

        {
            knop.addActionListener(new knoplistener());
        }
    }
    private class knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gezocht = myArray.length;
            gevonden = true;
            int teller = 0;
            while (teller < myArray.length) {
                if (myArray[teller] == gezocht);
                gezocht = Integer.parseInt(text1.getText());
                 gevonden = false;

            }
            teller++;
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (gevonden == true) {
            g.drawString("De waarde is gevonden."+text1  , 50, 50);
        }
        else {
            g.drawString("De waarde is niet gevonden.", 50, 50);
            repaint();
        }
    }
}
