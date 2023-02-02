import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1117 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        double nota1 = sc.nextDouble();
        int total = 0;

        while (nota1 < 0 || nota1 > 10) {
            System.out.println("nota invalida");
            nota1 = sc.nextDouble();
        }
        double nota2 = sc.nextDouble();
        while (nota2 < 0 || nota2 > 10) {
            System.out.println("nota invalida");
            nota2 = sc.nextDouble();
        }
        double media = (nota1 + nota2) / 2;
        System.out.printf("media = %.2f\n", media);

        sc.close();
    }
}
