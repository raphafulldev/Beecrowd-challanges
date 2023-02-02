import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1118_atencao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int sim = 1;
        double media;

        while (sim == 1){
            double nota1 = sc.nextDouble();
            while (nota1 < 0 || nota1 > 10){
                System.out.println("nota invalida");
                nota1 = sc.nextDouble();
            }
            double nota2= sc.nextDouble();
            while (nota2 < 0 || nota2 > 10){
                System.out.println("nota invalida");
                nota2 = sc.nextDouble();
            }
            media = (nota1 + nota2) / 2;
            System.out.printf("media = %.2f\n",media);

            System.out.println("novo calculo (1-sim 2-nao)");
            sim = sc.nextInt();
            while (sim != 1 && sim != 2){
                System.out.println("novo calculo (1-sim 2-nao)");
                sim = sc.nextInt();
            }

        }

        sc.close();
    }
}
