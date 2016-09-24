package hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H083 extends Applet {

    TextField nameField;
    Button knop;
    Label label;
    Label labelbtw;

    double a;
    double totaal;


    public void init() {
        totaal = 0;
        knop = new Button("Ok");
        label = new Label("bedrag");
        labelbtw = new Label("bedrag incl. BTW: " + totaal);
        nameField = new TextField("", 5);
        add(knop);
        add(nameField);
        add(label);
        add(labelbtw);

        knop.addActionListener(new knoplistener());


    }

    public class knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = Integer.parseInt(nameField.getText());
            totaal = a * 1.21;
            repaint();
        }

    }

    public void paint(Graphics g) {
        g.drawString("Incl. BTW " + totaal, 20, 60);
    }
}