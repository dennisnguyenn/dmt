package hoofdstuk11;

/**
 * Created by denni_000 on 26-10-2016.
 */
import java.awt.*;
import java.applet.*;


public class H112 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 20;
        int y = 0;

        while(teller <= 20) {
            y += 26;
            g.drawString("" + teller, 305, y );
            teller--;
        }
    }
}