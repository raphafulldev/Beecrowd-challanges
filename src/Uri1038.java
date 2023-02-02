import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double soma = 0;
        double valor = 0;

        if (codigo == 1) {
            valor = 4;
            soma = valor * quantidade;
            System.out.printf("Total: R$ %.2f\n", soma);
        } else if (codigo == 2) {
            valor = 4.5;
            soma = valor * quantidade;
            System.out.printf("Total: R$ %.2f\n", soma);
        } else if (codigo == 3) {
            valor = 5;
            soma = valor * quantidade;
            System.out.printf("Total: R$ %.2f\n", soma);
        } else if (codigo == 4) {
            valor = 2;
            soma = valor * quantidade;
            System.out.printf("Total: R$ %.2f\n", soma);
        } else if (codigo == 5) {
            valor = 1;
            soma = valor * quantidade;
            System.out.printf("Total: R$ %.2f\n", soma);
        }

        sc.close();
    }
}
