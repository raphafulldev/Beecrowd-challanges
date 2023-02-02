import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1101_atencao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        while (m > 0 && n > 0){
            int menor = m;
            int maior = n;
            if (m > n){
                maior = m;
                menor = n;
            }
            int soma = 0;

            for (int i = menor ; i <= maior; i++) {
                System.out.print(i + " " );
                soma += i;
            }
            System.out.println("Sum=" + soma);
            m = sc.nextInt();
            n = sc.nextInt();

        }

        sc.close();
    }
}
