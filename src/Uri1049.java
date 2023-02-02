import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class Uri1049 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(in);

        String n1 = sc.next();
        String n2 = sc.next();
        String n3 = sc.next();

        if (n1.equals("vertebrado")){
            if (n2.equals("ave")){
                if (n3.equals("carnivoro")){
                    System.out.println("aguia");
                }else if (n3.equals("onivoro")){
                    System.out.println("pomba");
                }
            }else if (n2.equals("mamifero")){
                if (n3.equals("onivoro")){
                    System.out.println("homem");
                }else if (n3.equals("herbivoro")){
                    System.out.println("vaca");
                }
            }
        }
        if (n1.equals("invertebrado")){
            if (n2.equals("inseto")){
                if (n3.equals("hematofago")){
                    System.out.println("pulga");
                }else if (n3.equals("herbivoro")){
                    System.out.println("lagarta");
                }
            }else if (n2.equals("anelideo")){
                if (n3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else if (n3.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();
    }
}
