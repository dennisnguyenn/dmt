package hoofdstuk6;

import java.awt.*;
import java.applet.*;
import java.text.DecimalFormat;


public class P06 extends Applet {

    double a, b, c,d, uitkomst;

    public void init() {
        a = 69;
        b = 63;
        c = 59;
        d = 30;
        uitkomst = (a + b +c) /d ;

    }

    public void paint(Graphics g) {
        DecimalFormat df = new DecimalFormat("#.#");
        g.drawString("De uitkomst is: " +  df.format(uitkomst), 20, 20);
    }
}
