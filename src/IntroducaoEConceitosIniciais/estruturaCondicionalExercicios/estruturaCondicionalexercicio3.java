package IntroducaoEConceitosIniciais.estruturaCondicionalExercicios;

import java.util.Scanner;

public class estruturaCondicionalexercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.println("Insira dois valores");
        
        A = sc.nextInt();
        B = sc.nextInt();

        if ((A % B) == 0 || (B % A) == 0) {

            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}
