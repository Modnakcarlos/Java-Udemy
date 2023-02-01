package comportamentoDeMemoriaArraysListas.arrays.exercicios.exercicio8;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma, mediaPares, quantPares;

        System.out.print("QUANTOS ELEMENTOS VAI TER O VETOR? ");
        int n = sc.nextInt();

        double[] valores = new double[n];

        for(int i = 0; i < n; i++) {
            valores[i] = sc.nextDouble();
        }

        soma = 0;
        quantPares = 0;
        
        for(int i = 0; i < n; i++) {
            if(valores[i] % 2 == 0) {
                soma += valores[i];
                quantPares++;
            }       
        }
        
        mediaPares = soma / quantPares;

        if(quantPares == 0) {
            System.out.println("NENHUM NÚMERO PAR");
        }
        else {
            System.out.printf("MÉDIA DOS PARES: %.1f", mediaPares);
        }

        


        sc.close();
    }
}