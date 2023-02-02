import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1065 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int contPar = 0;

        for (int i = 0; i < 5 ; i ++){
            int n = sc.nextInt();
            if (n % 2 == 0){
                contPar ++;
            }
        }
        System.out.println(contPar + " valores pares");


        sc.close();
    }
}
