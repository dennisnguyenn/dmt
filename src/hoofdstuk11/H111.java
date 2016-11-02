package hoofdstuk11;

/**
 * Created by denni_000 on 25-10-2016.
 */
import java.awt.*;
import java.applet.*;


public class H111 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;

        for(teller = 0; teller < 11; teller++) {
            y += 20;
            g.drawLine(50 , y, 300, y );
            g.drawString("" + teller, 305, y );
        }
    }
}