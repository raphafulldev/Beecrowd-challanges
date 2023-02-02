import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int contPositivo = 0;
        int contNegativo = 0;

        for (int i = 0 ; i < 6 ; i++){
            double n = sc.nextDouble();
            if (n > 0){
                contPositivo ++;
            }else {
                contNegativo ++;
            }

        }
        System.out.println(contPositivo + " valores positivos");

        sc.close();
    }
}
