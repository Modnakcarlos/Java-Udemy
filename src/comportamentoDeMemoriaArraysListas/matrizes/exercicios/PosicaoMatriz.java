package comportamentoDeMemoriaArraysListas.matrizes.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class PosicaoMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de linhas e colunas:");
        System.out.print("Linhas: ");
        int l = sc.nextInt();
        sc.nextLine();
        System.out.print("Colunas: ");
        int c = sc.nextInt();
        sc.nextLine();

        int[][] matriz = new int [l][c];

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Escolha o elemento da matriz: ");
        int valorPrincipal = sc.nextInt();

        
        int indicador = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(valorPrincipal == matriz[i][j]) {
                    indicador = indicador + 1;
                }
            }
        }

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(valorPrincipal == matriz[i][j]) {
                    if(j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if(i > 0) {
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                    }
                    if(j < matriz[i].length-1) {
                        System.out.println("Direita:" + matriz[i][j + 1]);
                    }
                    if(i < matriz.length-1) {
                        System.out.println("Abaixo: " + matriz[i - 1][j]);
                    }
                }
            }
        }

        if(indicador != 0) {
            System.out.println("O valor inserido não está contido na matriz.");
        }
        sc.close();
    }
}
