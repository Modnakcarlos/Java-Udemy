package IntroducaoEConceitosIniciais.estruturaRepetitivaWhileExercicios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senhaDoUsuario = sc.nextInt();
        int senhaCorreta = 2002;

        while (senhaDoUsuario != senhaCorreta) {
            System.out.println("Senha Inválida");
            senhaDoUsuario = sc.nextInt();    
        }

        System.out.println("Acesso Permitido");








        sc.close();
    }
}
