package hoofdstuk12;

        import java.applet.Applet;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.util.Arrays;

/**
 * Created by denni_000 on 7-11-2016.
 */
public class H123 extends Applet {

    int[] getallen;
    TextField[] tekstvelden;
    Button knop;

    @Override
    public void init() {

        getallen = new int[5];
        tekstvelden = new TextField[5];

        for (int i = 0; i < tekstvelden.length; i++) {
            tekstvelden[i] = new TextField("", 7);
            add(tekstvelden[i]);
        }
        knop = new Button("Klik");
        knop.addActionListener(new KnopListener());
        add(knop);
    }

    private class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < getallen.length; i++) {
                getallen[i] = Integer.parseInt(tekstvelden[i].getText());
            }
            Arrays.sort(getallen);

            for (int i = 0; i < tekstvelden.length; i++) {
                tekstvelden[i].setText("" + getallen[i]);
            }
        }
    }
}