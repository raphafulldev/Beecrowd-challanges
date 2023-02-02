import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1071_atencao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int maior, menor;
        int soma = 0;

        if (x > y){
            maior = x;
            menor = y;
        }else {
            maior = y;
            menor = x;
        }
        for (int i = menor + 1; i < maior ; i++){
            if (i % 2 != 0){
               soma += i;
            }
        }
        System.out.println(soma);


        sc.close();
    }
}
