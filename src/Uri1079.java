import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
        double media = 0;

        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble() * 2;
            double b = sc.nextDouble() * 3;
            double c = sc.nextDouble() * 5;

            media = (a + b + c) / 10;
            System.out.printf("%.1f\n", media);

        }

        sc.close();
    }
}
