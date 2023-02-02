import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1078_tabuada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int x = sc.nextInt();
        int cont =0;

        for (int i = 1; i <= 10; i++) {
            cont = i * x;
            System.out.println(i + " x " + x + " = " + cont);
        }

        sc.close();
    }
}
