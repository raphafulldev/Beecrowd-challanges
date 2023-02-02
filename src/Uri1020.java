import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1020 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();

        int ano =  n / 365;
        int resto = n % 365;
        int mes = resto / 30;
        int dia = resto % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");

        sc.close();
    }
}
