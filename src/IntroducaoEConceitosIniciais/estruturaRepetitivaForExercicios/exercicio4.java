package IntroducaoEConceitosIniciais.estruturaRepetitivaForExercicios;

import java.util.Scanner;

public class exercicio4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de números desejados");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {

            System.out.println("Qual o numerador da divisão?");
            int numerador = sc.nextInt();    
            System.out.println("Qual o denominador da divisão?");
            int denominador = sc.nextInt();
                
            if(denominador == 0) {
                System.out.println("Divisão impossível");
            }
            else {
                double div = numerador / denominador;
                System.out.printf("O resultado da divisão é %.1f%n", div);
            }
        
        }












        sc.close();
    }
}
