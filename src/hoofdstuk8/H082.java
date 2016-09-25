package hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H082 extends Applet
{

    Button man, vrouw, man1, vrouw1;


    int man2, man3, vrouw2, vrouw3, totaal;


    public void init() {
        man = new Button("man");
        vrouw = new Button("vrouw");
        man1 = new Button("Potentiele man");
        vrouw1 = new Button("Potentiele vrouw");

        man2 = 0;
        man3 = 0;
        vrouw2 = 0;
        vrouw3 = 0;
        totaal = 0;

        add(man);
        add(vrouw);
        add(man1);
        add(vrouw1);

        man.addActionListener(new Manlistener());
        vrouw.addActionListener(new vrouwlistener());
        man1.addActionListener(new Man1listener());
        vrouw1.addActionListener(new vrouw1listener());

    }

    public class Manlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man2++;
            totaal++;
            repaint();
        }
    }

    public class vrouwlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw2++;
            totaal++;
            repaint();
        }
    }

    public class Man1listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man3++;
            totaal++;
            repaint();
        }
    }

    public class vrouw1listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouw3++;
            totaal++;
            repaint();
        }
    }
    public void paint(Graphics g) {
        g.drawString("Aantal mannen " + man2,20,60);
        g.drawString("Aantal vrouwen " + vrouw2,20,80);
        g.drawString("Aantal potentiele mannen " + man3,20,100);
        g.drawString("Aantal potentiele vrouwen " + vrouw3,20,120);
        g.drawString("Totaal" + totaal,20,140);

    }
}