import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1145_atencao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        for (int i = 1; i <= y ; i++) {
            System.out.print(i);
            if (i % x != 0){
                System.out.print(" ");
            }else System.out.println();
        }

        sc.close();
    }
}
