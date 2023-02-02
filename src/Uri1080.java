import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1080 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int pos =0;
        int maior = 0;

        for (int i = 1; i <= 100; i++) {
            int x = sc.nextInt();
            if (x > maior){
                maior = x;
                pos = i;
            }
        }
        System.out.println(maior);
        System.out.println(pos);

        sc.close();
    }
}
