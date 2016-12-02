package hoofdstuk12;

/**
 * Created by denni_000 on 2-11-2016.
 */
import java.awt.*;
import java.applet.*;

public class H121 extends Applet {

    int myArray [] = {10,10,10,10,10,10,10,10,10,10};
    int average;

    public void init() {
        for (int i = 0; i < 10; i++) {
            average += myArray [i];

    }
    average = average / 10;
    }

    public void paint(Graphics g) {
    g.drawString(""+average, 50,50 );
    }
}