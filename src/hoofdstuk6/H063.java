package hoofdstuk6;

import java.awt.*;
import java.applet.*;

public class H063 extends Applet {

    int a;
    int b;
    int c;
    int uitkomst;



    public void init() {
        a = -1;
        b = 1;
        c = -1;
        uitkomst = (a + b) + c;
    }
    public void paint(Graphics g) {
    g.drawString("Totaal " + uitkomst, 100, 100);

    }
}