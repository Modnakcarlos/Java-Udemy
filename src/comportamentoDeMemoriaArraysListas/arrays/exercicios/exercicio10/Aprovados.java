package comportamentoDeMemoriaArraysListas.arrays.exercicios.exercicio10;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.print("Quantos alunos serão digitados? ");
        n = sc.nextInt();
        //sc.nextLine();

        String[] nome = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.printf("Digite nome, primeira nota e a segunda nota do %do aluno: ", i + 1);
            sc.nextLine();
            nome[i] = sc.nextLine();
                nota1[i] = sc.nextDouble();            
                nota2[i] = sc. nextDouble();
            
        }

        soma = 0;
        media = 0;
        
        System.out.println("Alunos aprovados: ");

        for(int i = 0; i < n; i++) {
            soma = nota1[i] + nota2[i];
            media = soma / 2;

            if(media >= 6) {                
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}
