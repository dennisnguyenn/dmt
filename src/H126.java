package hoofdstuk12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by denni_000 on 11-11-2016.
 */
public class H126 extends Applet {
    String[] string1;
    String[] string2;
    String[] string3;
    String[] string4;
    String[] string5;
    String[] string6;

    TextField teksvelden1;
    TextField teksvelden2;
    TextField teksvelden3;
    TextField teksvelden4;
    TextField teksvelden5;
    TextField teksvelden6;

    boolean vol;

    int teller;

    Button knop;


    public void init() {
        string1 = new String[1];
        string2 = new String[1];
        string3 = new String[1];
        string4 = new String[1];
        string5 = new String[1];
        string6 = new String[1];

        teller = 0;

        teksvelden1 = new TextField("", 10);
        teksvelden2 = new TextField("", 10);
        teksvelden3 = new TextField("", 10);
        teksvelden4 = new TextField("", 10);
        teksvelden5 = new TextField("", 10);
        teksvelden6 = new TextField("", 10);

        add(teksvelden1);
        add(teksvelden2);
        add(teksvelden3);
        add(teksvelden4);
        add(teksvelden5);
        add(teksvelden6);

        knop = new Button("Klik hier");
        add(knop);
        knop.addActionListener(new knopListener());
    }

    private class knopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            string1[teller] = teksvelden1.getText();
            string2[teller] = teksvelden2.getText();
            string3[teller] = teksvelden3.getText();
            string4[teller] = teksvelden4.getText();
            string5[teller] = teksvelden5.getText();
            string6[teller] = teksvelden6.getText();
            teller++;

            if (teller == 1) ;
            vol = true;
            repaint();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (vol) {
            int y = 100;
            int x = 50;
            for (int i = 0; i == 0; i++) {
                g.drawString("" + string1[i], x, y);
                y += 20;
                g.drawString("" + string2[i], x, y);
                y += 20;
                g.drawString("" + string3[i], x, y);
                y += 20;
                g.drawString("" + string4[i], x, y);
                y += 20;
                g.drawString("" + string5[i], x, y);
                y += 20;
                g.drawString("" + string6[i], x, y);
                y += 20;
            }
        }
    }
}