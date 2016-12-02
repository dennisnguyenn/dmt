package hoofdstuk12;

import java.applet.*;
import java.awt.*;


/**
 * Created by denni_000 on 6-11-2016.
 */

    public class H122 extends Applet {
    Button myArray[] = new Button[25];

    public void init() {
        for (int i = 0; i < 25; i++) {
            myArray[i] = new Button("" +i);
        }
        for (int i = 0; i < 25; i++) {
            add(myArray[i]);
        }
    }
}
