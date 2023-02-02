import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        double PI = 3.14159;

        double raio = sc.nextDouble();
        double area = PI * Math.pow(raio,2);

        System.out.printf("A=%.4f\n", area );

        sc.close();
    }
}
