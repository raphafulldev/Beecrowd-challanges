import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        double salary = sc.nextDouble();
        double incremento;
        double novoSalario;

        if (salary <= 400) {
            incremento = 15;
        } else if (salary <= 800) {
            incremento = 12;
        } else if (salary <= 1200) {
            incremento = 10;
        } else if (salary <= 2000) {
            incremento = 7;
        } else {
            incremento = 4;
        }
        novoSalario = salary + salary * (incremento / 100);
        System.out.printf("Novo salario: %.2f\n", novoSalario);
        double reajusteGanho = novoSalario - salary;
        System.out.printf("Reajuste ganho: %.2f\n", reajusteGanho);
        System.out.printf("Em percentual: %.0f %%\n", incremento);


        sc.close();
    }
}
