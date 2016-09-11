package hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class H046 extends Applet {

    public void init(){}

    public void paint(Graphics g) {

        g.setColor(Color.black);
        g.fillRoundRect(150, 100, 60, 150, 15, 15);
        g.setColor(Color.red);
        g.fillOval(162, 120, 35, 35);
        g.setColor(Color.yellow);
        g.fillOval(162, 160, 35, 35);
        g.setColor(Color.green);
        g.fillOval(162, 200, 35, 35);
    }

}

