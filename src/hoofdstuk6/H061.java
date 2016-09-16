package hoofdstuk6;

import java.awt.*;
import java.applet.*;


public class H061 extends Applet {
    int a, b, c;
    double uitkomst;


    public void init() {
        a = 113;
        b = 0;
        c = 4;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {
        g.drawString("Jan €" + uitkomst, 100, 100);
        g.drawString("Ali €" + uitkomst, 100, 125);
        g.drawString("Jeannette €" + uitkomst, 100, 150);
        g.drawString("Mezelf €" + uitkomst, 100, 175);
    }
}