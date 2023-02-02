import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setProperty;

public class Uri1019 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();

        int horas = n / 3600;
        int resto = n % 3600;
        int minutos = resto / 60;
        int segundo = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundo);


        sc.close();
    }
}
