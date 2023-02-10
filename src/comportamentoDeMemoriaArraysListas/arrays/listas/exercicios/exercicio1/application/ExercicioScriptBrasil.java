package comportamentoDeMemoriaArraysListas.arrays.listas.exercicios.exercicio1.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import comportamentoDeMemoriaArraysListas.arrays.listas.exercicios.exercicio1.entities.Cliente;

public class ExercicioScriptBrasil {
    public static void main(String[] args) {
        
        /*
        Crie um objeto chamado Cliente com os atributos: id, nome, idade, telefone.
        Faça um programa para solicitar os dados de vários clientes e armazenar em um ArrayList
        até que se digite um número de ID negativo. Em seguida exiba os dados de todos os clientes via SystemOut,
        formatando cada objeto separado por linhas.
        */
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Cliente> dados = new ArrayList<>();

        System.out.println("Digite os dados solicitados:"); 
        char resp;
        do{
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Telefone: ");
            long telefone = sc.nextLong();
            
            System.out.print("Deseja cadastrar mais um cliente (s/n): ");
            resp = sc.next().charAt(0);

            dados.add(new Cliente(id, nome, idade, telefone));
        }
        while(resp != 'n');

        System.out.println(" " + dados);









        sc.close();
    }
}
