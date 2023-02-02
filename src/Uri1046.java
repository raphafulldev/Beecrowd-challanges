import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1046 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        int tempo;

        if (inicio < fim){
            tempo = fim - inicio;
            System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
        }else {
            tempo = 24 - inicio + fim;
            System.out.println("O JOGO DUROU " + tempo + " HORA(S)");

        }



        sc.close();
    }
}
