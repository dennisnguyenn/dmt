package hoofdstuk4;

import java.awt.*;
import java.applet.*;


    public class PO4 extends Applet {
    public void init (){}
    public void paint (Graphics g){

        //Lijn!
        g.drawLine (90,120,290,120);
        g.drawString("Lijn", 180, 150);

        //Rechthoek!
        g.drawRect(90,170,200,120);
        g.drawString("Rechthoek",157,310);

        //Afgeronde rechthoek!
        g.drawRoundRect(90,330,200,120,30,30);
        g.drawString("Afgeronde rechthoek",130,470);

        //Gevulde rechthoek met ovaal!
        g.setColor(Color.magenta);
        g.fillRect(310, 170, 200, 120);
        g.setColor(Color.black);
        g.drawOval(310, 170 , 200, 120);
        g.drawString("Gevulde rechthoek met ovaal",330, 305);

        //Gevulde Ovaal!
        g.setColor(Color.magenta);
        g.fillOval(310, 330, 200, 120);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",365 ,469);

        //Taartpunt met ovaal eromheen!
        g.setColor(Color.black);
        g.drawArc(530, 170, 150, 125, 0, 360);
        g.setColor(Color.magenta);
        g.fillArc(530, 170, 150, 125, 135, 45);

        //Cirkel!
        g.setColor(Color.black);
        g.drawOval(530, 340, 110, 110);
        g.drawString("Cirkel",570, 470);





    }
}
