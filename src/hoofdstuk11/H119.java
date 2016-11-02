package hoofdstuk11;

/**
 * Created by denni_000 on 28-10-2016.
 */

import java.awt.*;
import java.applet.*;

public class H119 extends Applet {

    public void paint(Graphics g) {
        g.drawRect(49,49,81,81);
        int y = 50;
        for (int counter = 0; counter < 4; counter++) {
            int x = 50;

            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, 10, 10);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 10, 10);
                }
                x += 10;
            }
            x = 50;
            y += 10;

            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 10, 10);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, 10, 10);
                }
                x += 10;
            }
            y += 10;
        }
    }
}