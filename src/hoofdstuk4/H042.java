package hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class H042 extends Applet{
    public void paint(Graphics g)
    {
        g.drawLine(40,180,150,10);
        g.drawLine(260,180,150,10);
        g.drawRect(40,180,221,0);

        g.drawRect(80,180,150,150);
        g.drawRect(180,290,15,40);
        g.drawRect(100,200,60,15);

    }

}
