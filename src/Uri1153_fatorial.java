import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1153_fatorial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }
        System.out.println(fat);
        sc.close();
    }
}
