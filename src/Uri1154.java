import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1154 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int idade = sc.nextInt();
        int cont = 0;
        int soma = 0;

        while (idade >= 0){
            cont ++;
            soma += idade;
            idade = sc.nextInt();
        }
        double media = (double) soma / cont;
        System.out.printf("%.2f\n", media);

        sc.close();
    }
}
