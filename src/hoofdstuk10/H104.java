package hoofdstuk10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H104 extends Applet implements ActionListener
{
    Label label;
    TextField text;
    Button knop;
    int jaar;
    boolean bl;
    public void init()
    {
        label=new Label("");
        text = new TextField(5);
        knop = new Button("Ok");

        add(text);
        add(knop);
        add(label);
        knop.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        jaar = Integer.parseInt(text.getText());

        if (jaar%4!=0)
            bl=false;
        else if (jaar%1!=0)
            bl=true;
        else if(jaar%4!=0)
            bl=false;
        else
            bl=true;
        if (bl==true)
            label.setText(jaar+" Is een schrikkeljaar");
        else
            label.setText(jaar+" Is geen Schrikkeljaar");
        text.setText("");
    }
}