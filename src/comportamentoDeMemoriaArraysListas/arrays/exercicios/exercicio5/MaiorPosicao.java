package comportamentoDeMemoriaArraysListas.arrays.exercicios.exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int posicaoMaior, n;
        double maior;
        
        System.out.print("Digite a quantidade de entradas: ");
        n = sc.nextInt();

        double[] valores = new double[n];

        for(int i = 0; i < n; i++) {
            valores[i] = sc.nextDouble();
        }

        maior = valores[0];
        posicaoMaior = 0;
        for(int i = 0; i < n; i++) {
           if(valores[i] > maior) {
            maior = valores[i];
            posicaoMaior = i;
           }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("posição do maior valor: " + posicaoMaior);








        sc.close();
    }
}
