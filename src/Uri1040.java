import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        double n1 = sc.nextDouble() * 2;
        double n2 = sc.nextDouble() * 3;
        double n3 = sc.nextDouble() * 4;
        double n4 = sc.nextDouble() * 1;

        double media = (n1 + n2 + n3 + n4) / 10;

        System.out.printf("Media: %.1f\n", media);

        if (media < 5) {
            System.out.println("Aluno reprovado.");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            double exame = sc.nextDouble();
            double notaFinal = (exame + media) / 2;
            System.out.printf("Nota no exame: %.1f\n", exame);
            if (notaFinal >= 5){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n",  notaFinal );
            }else {
                System.out.println("Aluno reprovado.");
            }
        } else {
            System.out.println("Aluno aprovado.");
        }

        sc.close();
    }
}
