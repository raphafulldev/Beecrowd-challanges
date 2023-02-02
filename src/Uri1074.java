import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1074 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0){
                System.out.println("NULL");
            }
            if (x < 0 && x % 2 != 0) {
                System.out.println("ODD NEGATIVE");
            } else if (x > 0 && x % 2 != 0) {
                System.out.println("ODD POSITIVE");
            }
            if (x < 0 && x % 2 == 0){
                System.out.println("EVEN NEGATIVE");
            }else if (x > 0 && x % 2 == 0){
                System.out.println("EVEN POSITIVE");
            }

        }

        sc.close();
    }
}
