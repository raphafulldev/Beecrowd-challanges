import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1064 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int contPositivo = 0;
        double soma = 0;

        for (int i = 0 ; i < 6 ; i++){
            double n = sc.nextDouble();
            if (n > 0){
                contPositivo ++;
                soma += n;
            }

        }
        double media = soma / contPositivo;
        System.out.println(contPositivo + " valores positivos");
        System.out.printf("%.1f\n", media);

        sc.close();
    }
}
