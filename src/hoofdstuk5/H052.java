package hoofdstuk5;

import java.awt.*;
import java.applet.*;

public class H052 extends Applet {

    public void init() {
    }

    int valerie = 40;
    int jeroen = 100;
    int hans = 80;
    int hoogtexas = 200;
    int v = hoogtexas - valerie;
    int j = hoogtexas - jeroen;
    int h = hoogtexas - hans;

    public void paint(Graphics g) {
        g.drawLine(200, 50, 200, 200);
        g.drawLine(350, 200, 200, 200);
        g.fillRect(220, v,30, valerie);
        g.fillRect(270, j, 30,jeroen);
        g.fillRect(320, h, 30,hans);
        g.drawString("Valerie", 220, 215);
        g.drawString("Jeroen", 270, 215);
        g.drawString("Hans", 320, 215);
        g.drawString("0", 180, 200);
        g.drawString("150", 175, 60);
    }
}
