import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1142_PUM {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
        int inicio = 1;

        for (int i = 1; i <= n; i++) {
            int segundo = inicio + 1;
            int terceiro = inicio + 2;
            System.out.printf("%d %d %d PUM\n", inicio, segundo, terceiro);
            inicio += 4;
        }

        sc.close();
    }
}
