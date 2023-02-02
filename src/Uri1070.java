import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1070 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
        int cont = 0;

        while (cont < 6){
            cont++;
            if (n % 2 == 0){
                n++;
                System.out.println(n);
            }else System.out.println(n);
            n++;
        }

        sc.close();
    }
}

