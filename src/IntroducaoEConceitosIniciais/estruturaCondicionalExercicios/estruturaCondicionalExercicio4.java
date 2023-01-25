package IntroducaoEConceitosIniciais.estruturaCondicionalExercicios;

import java.util.Scanner;

public class estruturaCondicionalExercicio4 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quando seu jogo iniciou?");
        int inicio = sc.nextInt();

        System.out.println("Quando seu jogo terminou?");
        int termino = sc.nextInt();

        int duracao;

        if (inicio < termino) {
            duracao = termino - inicio;
            System.out.println("O jogo durou " + duracao + " horas");
        } else {
            duracao = 24 - inicio + termino;
            System.out.println("O jogo durou " + duracao + " horas");
        }








        sc.close();
    }
}
