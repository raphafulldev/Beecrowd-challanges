import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1116_atencao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);
        int numerador =0, denominador=0;
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y == 0){
                System.out.println("divisao impossivel");
            }else {
                total = (double) x / y ;
                System.out.println(total);
            }
        }

        sc.close();
    }
}
