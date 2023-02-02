import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        String name = sc.next();
        double salary = sc.nextDouble();
        double vendas = sc.nextDouble();
        double total = salary + vendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", total);

        sc.close();
    }
}
