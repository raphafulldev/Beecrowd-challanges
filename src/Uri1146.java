import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1146 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int x = sc.nextInt();

        while (x != 0){
            for (int i = 1; i < x ; i++) {
                System.out.print(i + " ");
            }
            System.out.println(x);
            x = sc.nextInt();
        }

        sc.close();
    }
}
