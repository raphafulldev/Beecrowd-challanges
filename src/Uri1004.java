import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int prod = A * B;

        System.out.println("PROD = " + prod);


        sc.close();
    }
}
