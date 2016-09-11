package hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class H042 extends Applet{
    public void paint(Graphics gh)
    {
        gh.drawLine(40,180,150,10);
        gh.drawLine(260,180,150,10);
        gh.drawRect(40,180,221,0);

        gh.drawRect(80,180,150,150);
        gh.drawRect(180,290,15,40);
        gh.drawRect(100,200,60,15);

    }

}
