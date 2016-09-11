package hoofdstuk4;

import java.awt.*;
import java.applet.*;

public class H044 extends Applet {
    public void paint (Graphics g){
        g.drawString("100",40,40);
        g.drawString("80",40,70);
        g.drawString("60",40,100);
        g.drawString("40",40,130);
        g.drawString("20",40,160);
        g.drawLine(37, 185, 37, 35);
        g.drawString("Valerie", 70, 201);
        g.drawString("Jeroen", 140, 201);
        g.drawString("Hans", 210, 201);
        g.setColor(Color.yellow);
        g.fillRect(70, 124, 40, 66);
        g.setColor(Color.blue);
        g.fillRect(140, 35, 40, 155);
        g.setColor(Color.red);
        g.fillRect(210, 70, 40, 120);

    }
}

