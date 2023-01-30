package comportamentoDeMemoriaArraysListas.arrays.exercicios.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de valores a ser inserido: ");
        int quantidade = sc.nextInt();

        int[] numeros = new int[quantidade];

        for(int i = 0; i < quantidade; i++) {

            System.out.println("Insira o valor: ");
            numeros[i] = sc.nextInt();
        }

        for(int i = 0; i < quantidade; i++) {
         
            if(numeros[i] < 0) {
                System.out.println("Números negativos: " + numeros[i]);
            }
        }
        
        sc.close();
    }
}
