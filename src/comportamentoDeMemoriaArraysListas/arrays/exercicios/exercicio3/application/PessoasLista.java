package comportamentoDeMemoriaArraysListas.arrays.exercicios.exercicio3.application;

import java.util.Locale;
import java.util.Scanner;


public class PessoasLista {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double percentualMenores, somaDasAlturas, alturaMedia;
        int menores, n;
        
        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();
        sc.nextLine();

        

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("dados da %da pessoa:\n", i + 1);
            
            System.out.print("Nome: ");
            nome[i] = sc.next();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
            
        }
        
        somaDasAlturas = 0;
        menores = 0;
        
        for(int i = 0; i < n; i++) {
            if(idade[i] < 16) {
                menores ++;
            }
            somaDasAlturas += altura[i];
        }
        
        alturaMedia = somaDasAlturas / n;
        percentualMenores = ((double) menores / n) * 100.0;
        
        System.out.printf("Altura média: %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
        
        for(int i = 0; i < n; i++) {
            if(idade[i] < 16) {
                System.out.printf("\nNome: %s\n",  nome[i]);
            }
        }

        sc.close();
    }
}
