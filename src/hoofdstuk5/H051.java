package hoofdstuk5;

import java.awt.*;
import java.applet.*;


    public class H051 extends Applet {

    public void init (){}
    public void paint (Graphics g) {

        int x = 200;
        int y = 120;

        g.setColor(Color.magenta);
        
        //Lijn!
        g.drawLine (90,120,x,y);
        g.drawString("Lijn", 180, 150);

        //Rechthoek!
        g.drawRect(90,170,x,y);
        g.drawString("Rechthoek",157,310);

        //Afgeronde rechthoek!
        g.drawRoundRect(90,330,x,y,30,30);
        g.drawString("Afgeronde rechthoek",130,470);

        //Gevulde rechthoek met ovaal!
        g.fillRect(310, 170, x, y);
        g.drawOval(310, 170 , x, y);
        g.drawString("Gevulde rechthoek met ovaal",330, 305);

        //Gevulde Ovaal!
        g.fillOval(310, 330, x, y);
        g.drawString("Gevulde ovaal",365 ,469);

        //Taartpunt met ovaal eromheen!
        g.drawArc(530, 170, 150, 125, 0, 360);
        g.fillArc(530, 170, 150, 125, 135, 45);
        g.drawString("Taartpunt met ovaal eromeen", 540,310);

        //Cirkel!
        g.drawOval(530, 340, x, y);
        g.drawString("Cirkel",570, 470);





    }
}


