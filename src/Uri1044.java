import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1044 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int maior, menor;

        if (a > b) {
            maior = a;
            menor = b;
        } else {
            maior = b;
            menor = a;
        }

        if (maior % menor == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
