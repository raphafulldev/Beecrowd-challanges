import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1014 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        double km = sc.nextDouble();
        double gasto = sc.nextDouble();

        double autonomia = km / gasto;

        System.out.printf("%.3f km/l\n", autonomia);

        sc.close();
    }
}
