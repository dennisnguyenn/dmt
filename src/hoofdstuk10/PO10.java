package hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PO10 extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;

    int dag;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Typ je cijfer in");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";

        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "Onvoldoende";
                    break;
                case 2:
                    tekst = "Onvoldoende";
                    break;
                case 3:
                    tekst = "Onvoldoende";
                    break;
                case 4:
                    tekst = "Onvoldoende";
                    break;
                case 5:
                    tekst = "Matig";
                    break;
                case 6:
                    tekst = "Voldoende";
                    break;
                case 7:
                    tekst = "Voldoende";
                    break;
                case 8:
                    tekst = "Goed";
                    break;
                case 9:
                    tekst = "Goed";
                    break;
                case 10:
                    tekst = "Goed";
                    break;

                default:
                    tekst = "Ongeldige Cijfer";
                    break;
            }
            repaint();
        }
    }
}