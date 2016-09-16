package hoofdstuk6;

import java.awt.*;
import java.applet.*;


public class H062 extends Applet {

    int seconde = 1;
    int minuut = seconde * 60;
    int uur = minuut * 60;
    int dag = uur * 24;
    int jaar = dag * 365;


    public void init() {
    }

    public void paint(Graphics g) {
        g.drawString("In een uur zitten " + uur + " seconden", 100, 100);
        g.drawString("In een dag zitten " + dag + " seconden", 100, 120);
        g.drawString("In een jaar zitten " + jaar + " seconden", 100, 140);
    }
}