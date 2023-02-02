import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = Math.pow(b,2) - (4 * a * c);

        double formula1 =  (- b + Math.sqrt(delta))/ (2 * a);
        double formula2 =  (- b - Math.sqrt(delta))/ (2 * a);

        if (a == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        }else {
            System.out.printf("R1 = %.5f\n", formula1);
            System.out.printf("R2 = %.5f\n",  formula2);

        }

        sc.close();
    }
}
