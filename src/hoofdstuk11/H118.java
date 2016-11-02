package hoofdstuk11;

/**
 * Created by denni_000 on 28-10-2016.
 */
import java.awt.*;
import java.applet.*;


public class H118 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int vierkant;
        int y = 470;
        int x = 700;
        int x1 = 0;
        int y1 = 0;

        for (vierkant = 0; vierkant < 100; vierkant++) {
            y -= 5;
            x -= 5;
            x1+=10;
            y1+= 10;
            g.drawOval(x , y, x1, y1);

        }
    }
}