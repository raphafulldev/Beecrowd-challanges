import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1114 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int x = sc.nextInt();

        while (x != 2002){
            System.out.println("Senha Invalida");
            x = sc.nextInt();
        }
        System.out.println("Acesso Permitido");

        sc.close();
    }
}
