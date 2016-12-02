package hoofdstuk12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by denni_000 on 8-11-2016.
 */
public class PO12 extends Applet {

    String[] namen;
    String[] telefonen;

    Label naam1;
    Label telefoon1;

    TextField naam;
    TextField telefoon;
    Button knop;

    int teller;

    boolean vol;

    public void init() {
        teller = 0;
        namen = new String[10];
        telefonen = new String[10];

        naam1 = new Label("Naam");
        telefoon1 = new Label("Telefoon");
        add(naam1);
        add(telefoon1);

        naam = new TextField("", 15)    ;
        telefoon = new TextField("", 15);
        add(naam);
        add(telefoon);

        knop = new Button("klik");
        add(knop);

        knop.addActionListener(new knoplistener());

    }

    private class knoplistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            namen[teller] = naam.getText();
            telefonen[teller] = telefoon.getText();
            teller++;
            if (teller == 10) {
                vol = true;
                repaint();
            }
        }
    }

    public void paint(Graphics g) {
        if(vol) {
            int y = 60;
            int x = 50;
            for (int i = 0; i < 10; i++) {
                g.drawString("" + namen[i], x, y);
                g.drawString("" + telefonen[i], x + 100, y);
                y += 30;
            }
            knop.setVisible(false);
        }
    }
}