import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1047 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        int horaInicial = sc.nextInt();
        int minutoInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int minutoFinal = sc.nextInt();

        int instanteInicial = horaInicial * 60 + minutoInicial;
        int instanteFinal = horaFinal * 60 + minutoFinal;

        int duracao;
        if (instanteInicial < instanteFinal){
            duracao = instanteFinal - instanteInicial;
        }else {
            duracao = (60 * 24 - instanteInicial) + instanteFinal;
        }
        int finalHoras = duracao / 60;
        int finalMinutos = duracao % 60;
        System.out.println("O JOGO DUROU " + finalHoras + " HORA(S) E " + finalMinutos + " MINUTO(S)");


        sc.close();
    }
}
