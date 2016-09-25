package hoofdstuk8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H081 extends Applet implements ActionListener
{

    Button okButton;
    Button wrongButton;
    TextField nameField;
    Label label;

    public void init()
    {
        setLayout(new FlowLayout());
        okButton = new Button("Ok");
        wrongButton = new Button("Reset");
        nameField = new TextField("",35);
        add(okButton);
        add(wrongButton);
        add(nameField);
        label = new Label("Type iets in het  tekstvakje en druk op OK");
        add(label);


        okButton.addActionListener(this);
        wrongButton.addActionListener(this);
    }


    public void paint(Graphics g)
    {

        g.drawString(nameField.getText(),20,100);
    }



    public void actionPerformed(ActionEvent evt)
    {
        if (evt.getSource() == okButton)
            repaint();

        else if (evt.getSource() == wrongButton)
        {

            wrongButton.setLabel("Reset");
            nameField.setText("");
            repaint();
        }
    }
}