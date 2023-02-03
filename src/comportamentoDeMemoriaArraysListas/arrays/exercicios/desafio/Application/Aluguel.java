package comportamentoDeMemoriaArraysListas.arrays.exercicios.desafio.Application;

import java.util.Locale;
import java.util.Scanner;

import comportamentoDeMemoriaArraysListas.arrays.exercicios.desafio.entities.Data;

public class Aluguel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, quarto;
        String nome, email;
        Data[] dados = new Data[9];

        System.out.print("Quantos quartos serão alugados? ");
        n = sc.nextInt();
                        
        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println();
            System.out.printf("Aluguel: #%d\n", i + 1);
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Quarto: ");
            quarto = sc.nextInt();
            System.out.println();

            //Data aluguel = new Data(nome, email);
            //dados[quarto] = aluguel;               // fazer assim é válido, mas pode ser feito de outra maneira:

            dados[quarto] = new Data(nome, email);   // dessa maneira;

        }

        //int[] posicaoArray = new int[n];
        
        //for(int i = 0; i < dados.length; i++){
        //    posicaoArray[i] = dados[i].getQuarto();  
        //}
        
        
        System.out.println("Quartos alugados: ");
        for(int i = 0; i < dados.length; i++){ 
            if(dados[i] != null) {
                System.out.println(i + "" + dados[i]);
            }
        }        
    
        sc.close();
    }
}
