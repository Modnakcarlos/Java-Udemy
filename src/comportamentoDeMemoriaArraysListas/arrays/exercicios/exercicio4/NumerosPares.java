package comportamentoDeMemoriaArraysListas.arrays.exercicios.exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, quantidade;
        
        System.out.print("Digite a quantidade de entradas: ");

        n = sc.nextInt();

        int[] valores = new int[n];

        for(int i = 0; i < n; i++) {
            valores[i] = sc.nextInt();
        }
        
        quantidade = 0;

        System.out.println("Números pares:");
        for(int i = 0; i < n; i++) {
            if(valores[i] % 2 == 0) {
                quantidade++;
                
                System.out.printf("%d ", valores[i]);
            }
        }

        System.out.printf("\nQuantidade de pares: " + quantidade);





        sc.close();
        
    }
}
