package hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PO8 extends Applet {
    TextField getal1;
    TextField getal2;
    Button keer;
    Button delen;
    Button plus;
    Button min;

    int keer1;
    int delen1;
    int min1;
    int plus1;
    int totaal;
    int a;
    int b;

    public void init() {

        getal1 = new TextField("", 15);
        getal2 = new TextField("", 15);
        keer = new Button("*");
        delen = new Button("/");
        plus = new Button("+");
        min = new Button("-");

        add(getal1);
        add(getal2);
        add(keer);
        add(delen);
        add(plus);
        add(min);

        keer.addActionListener(new keerlistener());
        delen.addActionListener(new delenListener());
        plus.addActionListener(new plusListener());
        min.addActionListener(new minListener());

    }

    public class keerlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = Integer.parseInt(getal1.getText());
            b = Integer.parseInt(getal2.getText());

            totaal = a * b;
            repaint ();
        }
    }

    public class delenListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            a = Integer.parseInt(getal1.getText());
            b = Integer.parseInt(getal2.getText());

            totaal = a / b;
            repaint ();

        }
    }
    public class plusListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            a = Integer.parseInt(getal1.getText());
            b = Integer.parseInt(getal2.getText());

            totaal = a + b;
            repaint();
        }
    }
    public class minListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            a = Integer.parseInt(getal1.getText());
            b = Integer.parseInt(getal2.getText());

            totaal = a - b;
            repaint();
        }
    }
    public void paint (Graphics g) {
        g.drawString("antwoord " + totaal,20,80);
    }
}
