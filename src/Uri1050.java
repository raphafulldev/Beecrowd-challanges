import java.util.Locale;
import java.util.Scanner;

public class Uri1050 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 61 || n == 71 || n == 11 || n == 21 || n == 32 || n == 19 || n == 27 || n == 31) {
            if (n == 61){
                System.out.println("Brasilia");
            } else if (n == 71){
                System.out.println("Salvador");
            } else if (n == 11) {
                System.out.println("Sao Paulo");
            } else if (n == 21) {
                System.out.println("Rio de Janeiro");
            } else if (n == 32) {
                System.out.println("Juiz de Fora");
            } else if (n == 19) {
                System.out.println("Campinas");
            } else if (n == 27) {
                System.out.println("Vitoria");
            }else{
                System.out.println("Belo Horizonte");
            }
        } else {
            System.out.println("DDD nao cadastrado");
        }
        sc.close();
    }
}
