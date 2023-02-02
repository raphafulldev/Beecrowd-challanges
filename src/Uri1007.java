import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1007 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int diferenca = A * B - C * D;

        System.out.println("DIFERENCA = " + diferenca);

        sc.close();
    }
}
