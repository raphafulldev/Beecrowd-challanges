import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;
import static java.util.Locale.US;
import static java.util.Locale.setDefault;

public class Uri1037 {
    public static void main(String[] args) {
        setDefault(US);
        Scanner sc = new Scanner(in);

        double n = sc.nextDouble();

        if (n < 0 || n > 100){
            System.out.println("Fora do intervalo");
        }else if (n <= 25 ){
            System.out.println("Intervalo [0,25]");
        }else if (n <= 50){
            System.out.println("Intervalo (25,50] ");
        }else if (n <= 75){
            System.out.println("Intervalo (50,75]");
        }else if (n <= 100){
            System.out.println("intervalo (75,100]");
        }

        sc.close();
    }
}
