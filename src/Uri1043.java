import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();


        if (a > b - c && b > a - c && c > a - b) {
            double area = a + b + c;
            System.out.printf("Perimetro = %.1f\n", area);
        } else {
            double area = (a + b) * c / 2;
            System.out.printf("Area = %.1f\n", area);
        }

        sc.close();
    }
}
