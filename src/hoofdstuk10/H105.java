package hoofdstuk10;

import java.util.Scanner;
/**
 *
 * @author denni_000
 */
public class H105 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totaal = 0;
        int cijfers;
        int gemiddelde;
        int teller =0;

        while (teller < 5){
            cijfers = input.nextInt();
            totaal = totaal + cijfers;
            teller++;
        }
        gemiddelde = totaal/5;
        System.out.println("gemiddelde is"+ gemiddelde);
    }
}