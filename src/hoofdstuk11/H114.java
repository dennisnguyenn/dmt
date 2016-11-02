package hoofdstuk11;

/**
 * Created by denni_000 on 27-10-2016.
 */

import java.awt.*;
import java.applet.*;


public class H114 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 0; teller < 33; teller+=3)  {
            y += 20;
            g.drawString("" + teller, 305, y );
        }
    }
}