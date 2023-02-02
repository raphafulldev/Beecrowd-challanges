import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int tempo = sc.nextInt();
        int dist = sc.nextInt();

        int consumo = 12;

        double totalGasto = (double) tempo * dist / consumo;

        System.out.printf("%.3f\n", totalGasto);

        sc.close();
    }
}
