import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1113 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        while (x != y){
            if (x > y){
                System.out.println("Decrescente");
            }else {
                System.out.println("Crescente");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
