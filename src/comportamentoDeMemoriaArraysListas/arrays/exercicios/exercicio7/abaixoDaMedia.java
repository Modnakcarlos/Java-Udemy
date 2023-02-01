package comportamentoDeMemoriaArraysListas.arrays.exercicios.exercicio7;

import java.util.Locale;
import java.util.Scanner;

public class abaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double somaValores, mediaDoVetor;
        
        System.out.print("QUANTOS ELEMENTOS VAI TER O VETOR? ");
        int n = sc.nextInt();

        double[] valores = new double[n];

        for(int i = 0; i < n; i++) {
            valores[i] = sc.nextDouble();
        }

        somaValores = 0;
        for(int i = 0; i < n; i++) {
            somaValores += valores[i];
        }

        mediaDoVetor = somaValores / n;

        System.out.printf("MÉDIA DO VETOR: %.3f\n", mediaDoVetor);

        
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for(int i = 0; i < n; i++) {
            if(valores[i] < mediaDoVetor) {
                System.out.println(valores[i]);
            }
        }

       




        sc.close();


    }
}