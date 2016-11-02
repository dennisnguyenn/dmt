package hoofdstuk10;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


    public class H102 extends Applet {
    TextField text;
    Label label;
    Button knop;
    Label label2;

    int a;
    int input;
    int b;

    public void init() {
        knop = new Button("Berekenen");
        text = new TextField();
        label = new Label("");
        label2 = new Label("");

        knop.addActionListener(new knoplistener());

        add(text);
        add(label);
        add(knop);
        add(label2);

        a = 0;
        b = 2147483647;

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
            if ( b > input ) {
                b = input;
                label2.setText("" + b);
            }
            repaint();
        }
             }
                }