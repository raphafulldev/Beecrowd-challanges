import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1015 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        double x1, y1, x2, y2;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2 - y1,2));

        System.out.printf("%.4f\n", distancia);

        sc.close();
    }
}
