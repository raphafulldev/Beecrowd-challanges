import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1131_grenal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int resp = 1;
        int vitInt =0;
        int vitGrem =0;
        int contJogos = 0;
        int empates = 0;

        while (resp == 1){
            contJogos ++;
            int golsInter = sc.nextInt();
            int golsGremio = sc.nextInt();

            if (golsInter > golsGremio){
                vitInt ++;
            }else if (golsGremio > golsInter){
                vitGrem ++;
            }else {
                empates++;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            resp = sc.nextInt();
            while (resp != 1 && resp != 2){
                System.out.println("Novo grenal (1-sim 2-nao)");
                resp = sc.nextInt();
            }
        }
        System.out.println(contJogos + " grenais");
        System.out.println("Inter:" + vitInt);
        System.out.println("Gremio:" + vitGrem);
        System.out.println("Empates:" + empates);
        if (vitInt > vitGrem){
            System.out.println("Inter venceu mais");
        }else {
            System.out.println("Gremio venceu mais");
        }

        sc.close();
    }
}
