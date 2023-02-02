import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1072 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
        int contIn = 0;
        int contOut = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){
                contIn ++;
            }else contOut++;
        }
        System.out.println(contIn + " in");
        System.out.println(contOut + " out");

        sc.close();
    }
}
