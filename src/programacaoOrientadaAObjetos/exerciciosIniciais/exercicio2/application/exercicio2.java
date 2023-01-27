package programacaoOrientadaAObjetos.exerciciosIniciais.exercicio2.application;

import java.util.Locale;
import java.util.Scanner;

import programacaoOrientadaAObjetos.exerciciosIniciais.exercicio2.entitites.Employee;

public class exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee funcionario = new Employee();

        System.out.print("Nome do funcionário: ");
        funcionario.nome = sc.nextLine();
        
        System.out.print("Salário bruto: ");
        funcionario.salarioBruto = sc.nextDouble();

        System.out.print("Desconto: ");
        funcionario.desconto = sc.nextDouble();

        System.out.println();

        System.out.println(funcionario.toString());

        System.out.print("Quantos por cento do seu salário você deseja aumentar? ");
        double porcentagem = sc.nextDouble();

        funcionario.aumentarSalario(porcentagem);

        System.out.println("Dados atualizados: " + funcionario.toString());






        










        sc.close();
    }
}
