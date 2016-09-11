package hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class H043 extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        g.drawRect(49, 29, 201, 151);
        g.drawLine(49, 331, 54, 331);
        g.drawLine(49, 180, 49, 330);
        g.drawLine(54, 180, 54, 330);
        g.setColor(Color.blue);
        g.fillRect(50, 130, 200, 50);
        g.setColor(Color.white);
        g.fillRect(50, 80, 200, 50);
        g.setColor(Color.red);
        g.fillRect(50, 30, 200, 50);



    }
}
