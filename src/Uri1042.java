import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1042 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int a, b, c, min1 = 0, min2 = 0, min3 = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        min1 = Math.min(a, Math.min(b, c));
        if (min1 == a) {
            min2 = Math.min(b, c);
            min3 = Math.max(b, c);
        } else if (min1 == b) {
            min2 = Math.min(a, c);
            min3 = Math.max(a, c);
        } else {
            min2 = Math.min(a, b);
            min3 = Math.max(a, b);
        }

        System.out.print(min1 + "\n" + min2 + "\n" + min3 + "\n\n");
        System.out.println(a + "\n" + b + "\n" + c + "\n");

        sc.close();
    }
}
