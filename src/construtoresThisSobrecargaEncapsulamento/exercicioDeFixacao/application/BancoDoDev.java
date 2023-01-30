package construtoresThisSobrecargaEncapsulamento.exercicioDeFixacao.application;

import java.util.Locale;
import java.util.Scanner;

import construtoresThisSobrecargaEncapsulamento.exercicioDeFixacao.entities.Dados;

public class BancoDoDev {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double saldo = 0;
        System.out.print("Insira os dados da conta. Qual o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Qual o nome do usuário: ");
        String nome = sc.nextLine();
        
        Dados dados = new Dados(numeroConta, nome, saldo);
        
        System.out.print("Deseja fazer um depósito inicial? (s/n): ");

        char acaoDepositar = sc.next().charAt(0);
        if(acaoDepositar == 's') {
            System.out.print("Qual o valor do depósito? ");
            
            saldo = sc.nextDouble();
            dados.setSaldo(saldo);
            dados.getSaldo();
            System.out.println();
            
            System.out.println(dados.toString());

        } else {
            System.out.println(dados.toString());
        }

        System.out.println();
        System.out.print("Insira um valor para depósito: ");
        
        saldo = sc.nextDouble();
        dados.depositar(saldo);

        System.out.println("atualização dos dados bancários:");
        System.out.println(dados.toString());

        System.out.print("Insira um valor para sacar: ");
        saldo = sc.nextDouble();
        dados.sacar(saldo);

        System.out.println("atualização dos dados bancários:");
        System.out.println(dados.toString());








        
        











        sc.close();
    }
}
