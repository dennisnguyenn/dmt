package hoofdstuk4;

import java.awt.*;
import java.applet.*;


public class H047 extends Applet {


    public void init (){}
    public void paint (Graphics g){

        g.setColor(Color.black);
        g.fillRoundRect(150, 100, 150, 150, 15, 15);
        g.setColor(Color.white);
        g.fillOval(160, 110, 50, 50);
        g.fillOval(160, 186, 50, 50);
        g.fillOval(234, 110, 50, 50);
        g.fillOval(234, 186, 50, 50);


    }
}





