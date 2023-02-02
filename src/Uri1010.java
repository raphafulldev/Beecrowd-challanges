import java.util.Locale;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.util.Locale.US;
import static java.util.Locale.setDefault;

public class Uri1010 {
    public static void main(String[] args) {
        setDefault(US);
        Scanner sc = new Scanner(in);

        int cod1, cod2, quantity1, quantity2;
        double price1, price2;

        cod1 = sc.nextInt();
        quantity1 = sc.nextInt();
        price1 = sc.nextDouble();
        cod2 = sc.nextInt();
        quantity2 = sc.nextInt();
        price2 = sc.nextDouble();

        double total = price1 * quantity1 + price2 * quantity2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        sc.close();
    }
}
