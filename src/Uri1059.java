import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1059 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

        sc.close();
    }
}
