import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1016 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int tempo = sc.nextInt() * 2;

        System.out.println(tempo + " minutos");

        sc.close();
    }
}
