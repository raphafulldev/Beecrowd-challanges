import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1144_sequenciaLogica {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int segundo = i * i;
            int terceiro = i * i * i ;

            System.out.printf("%d %d %d\n", i, segundo, terceiro);
            segundo ++;
            terceiro ++;
            System.out.printf("%d %d %d\n", i, segundo, terceiro);
        }

        sc.close();
    }
}
