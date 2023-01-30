package comportamentoDeMemoriaArraysListas.arrays.tipoPrimitivo;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
        }

        double soma = 0.0;
            for(int i = 0; i<n; i++) {
                soma += vetor[i];
            }

        double media = soma / 3;

        System.out.printf("A média das alturas é %.2f%n", media);

        










        sc.close();
    }
}
