package comportamentoDeMemoriaArraysListas.arrays.exercicios.exercicio2;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] valores = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Insira o valor: ");
            valores[i] = sc.nextInt();
            
        }

        
        double soma = 0.0;
        for(int i = 0; i < n; i++) {
            soma += valores[i];
        }

        double media = soma / n;

        System.out.print("valores: ");

        for(int i = 0; i < n; i++) {
        System.out.printf("%.1f ", valores[i]);
        }

        System.out.println("SOMA: " + soma);

        System.out.println("MÉDIA: " + media);

        sc.close();
    }
}
