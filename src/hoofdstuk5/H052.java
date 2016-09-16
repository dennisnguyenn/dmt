package hoofdstuk5;

import java.awt.*;
import java.applet.*;

public class H052 extends Applet {

    public void init (){}
    public void paint (Graphics g){

    int x = 60;
    int y = 155;


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
        g.fillRect(70, 124, x, 66);
        g.setColor(Color.blue);
        g.fillRect(140, 35, x, 155);
        g.setColor(Color.red);
        g.fillRect(210, 70, x, 120);

    }
}

