package comportamentoDeMemoriaArraysListas.matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    System.out.print("Insira a quantidade de linhas e colunas: ");
    int n = sc.nextInt();

    int[][] vetor = new int[n][n];

    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            vetor[i][j] = sc.nextInt();
        }
    }

    System.out.println("Diagonal principal");
    for(int i = 0; i < n; i++) {
        System.out.println(vetor[i][i] + " ");
    }
    System.out.println();

    int cont = 0;
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
            if(vetor[i][j] < 0) {
                cont++;
            }
        }
    }

    System.out.println("Quantidade de valores negativos: " + cont);







        sc.close();
    }
}
