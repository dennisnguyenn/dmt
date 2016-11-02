package hoofdstuk10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class H101 extends Applet {
    TextField text;
    Label label;
    Button knop;

    int a;
    int input;

    public void init() {
        knop = new Button("Klik Hier");
        text = new TextField();
        knop.addActionListener(new knoplistener());
        label = new Label(""+ a);
        add(text);
        add(label);
        add(knop);
        a = 0;

    }

    public void paint(Graphics g) {

    }

    public class knoplistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = Integer.parseInt(text.getText());
            if ( a < input ) {
                 a = input;
                label.setText("" + a);
            }
            repaint();
        }

    }
}