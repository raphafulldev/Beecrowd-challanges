import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1134_combustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int contAlcool = 0;
        int contGasolina = 0;
        int contDiesel = 0;
        int tipo = sc.nextInt();

        while (tipo != 4){
            if (tipo == 1){
                contAlcool ++;
            }else if (tipo == 2)
            {
                contGasolina ++;
            }else if (tipo == 3){
                contDiesel ++;
            }
            tipo = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + contAlcool);
        System.out.println("Gasolina: " + contGasolina);
        System.out.println("Diesel: " + contDiesel);
        sc.close();
    }
}
