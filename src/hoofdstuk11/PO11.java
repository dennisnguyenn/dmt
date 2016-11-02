package hoofdstuk11;

import java.util.Scanner;
/**
 *
 * @author denni_000
 */
public class PO11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int keertafel, teller , totaal;

        System.out.println("Typ een tafel in");
        keertafel = scanner.nextInt ();
        System.out.println("keer hoeveel?");
        teller = scanner.nextInt ();

        for (int i = 0; i <= teller; i++) {
            totaal = keertafel * i;
            System.out.println (keertafel + "x" + i + "=" + totaal);

        }
    }
}