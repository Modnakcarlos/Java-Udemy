package comportamentoDeMemoriaArraysListas.arrays.exercicios.exercicio9;
import java.util.Locale;
import java.util.Scanner;
public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int maisVelho, posicaoMaior;
       
        
        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[n];
        int[] idade = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();

            System.out.printf("Idade: ");
            idade[i] = sc.nextInt();
            sc.nextLine();
        }

        maisVelho = idade[0];
        posicaoMaior = 0;
       
        for(int i = 0; i < n; i++) {
            if(idade[i] > maisVelho) {
                maisVelho = idade[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", nome[posicaoMaior]);




        sc.close();
    }
}