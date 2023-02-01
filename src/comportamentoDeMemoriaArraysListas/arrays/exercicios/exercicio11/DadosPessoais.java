package comportamentoDeMemoriaArraysListas.arrays.exercicios.exercicio11;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoais {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");

        int n, numeroMulheres;
        
        n = sc.nextInt();
        //sc.nextLine();
        double menorAltura, maiorAltura, somaMulheres, mediaMulheres;

        double[] altura = new double[n];
        char[] genero = new char[n];

        for(int i = 0; i < n; i++) {
            //sc.nextLine();
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();

            System.out.printf("Gênero da %da pessoa (F/M): ", i + 1);
            genero[i] = sc.next().charAt(0);
        }

        menorAltura = altura[0];
        maiorAltura = altura[0];
        for(int i = 0; i < n; i++) {
            if(menorAltura > altura[i]) {
                menorAltura = altura[i];
            }
            else if(maiorAltura < altura[i]) {
                maiorAltura = altura[i];
            }
        }

        somaMulheres = 0;
        numeroMulheres = 0;
        
        for(int i = 0; i < n; i++) {
            if(genero[i] == 'F' || genero[i] == 'f') {
                somaMulheres += altura[i];
                numeroMulheres += 1;    
            }        
        }

        mediaMulheres = somaMulheres / numeroMulheres;

        System.out.printf("Menor Altura: %.2f\n", menorAltura);
        System.out.printf("Menor Altura: %.2f\n", maiorAltura);

        System.out.printf("Media das alturas das mulheres: %.2f\n", mediaMulheres);
        System.out.printf("Número de homens: %d\n", (n - numeroMulheres));
        
        sc.close();
    }
}