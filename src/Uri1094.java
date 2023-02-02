import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1094 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
        int contCoelho = 0;
        int contRato = 0;
        int contSapo = 0;
        int totalCobaias = 0;

        for (int i = 0; i < n; i++) {
            int numeroCobaias = sc.nextInt();
            totalCobaias += numeroCobaias;
            char tipoCobaia = sc.next().charAt(0);
            if (tipoCobaia == 'C'){
                contCoelho += numeroCobaias;
            }else if (tipoCobaia == 'R'){
                contRato+= numeroCobaias;
            }else if (tipoCobaia == 'S'){
                contSapo+= numeroCobaias;
            }
        }


        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + contCoelho);
        System.out.println("Total de ratos: " + contRato);
        System.out.println("Total de sapos: " + contSapo);

        double percentualCoelhos = (double) contCoelho * 100 /totalCobaias;
        double percentualRatos = (double) contRato * 100 /totalCobaias;
        double percentualSapos = (double) contSapo * 100 /totalCobaias;

        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);
        sc.close();
    }
}
