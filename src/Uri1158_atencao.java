import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1158_atencao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int soma = 0;
            int cont = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; cont < y; j++) {
                if (j % 2 != 0) {
                    soma += j;
                    cont++;
                }
            }
            System.out.println(soma);

        }
        sc.close();
    }
}
