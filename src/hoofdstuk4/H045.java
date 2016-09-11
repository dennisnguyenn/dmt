package hoofdstuk4;

import java.awt.*;
import java.applet.*;
import java.awt.Graphics;

public class H045 extends Applet {

    public void init() { setBackground(Color.blue); }


    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(50, 50, 100, 50, 0, 360);


    }
}