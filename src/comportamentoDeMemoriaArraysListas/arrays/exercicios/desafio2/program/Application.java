package comportamentoDeMemoriaArraysListas.arrays.exercicios.desafio2.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import comportamentoDeMemoriaArraysListas.arrays.exercicios.desafio2.entities.Funcionario;


public class Application {
    public static void main(String[]args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.printf("FUNCIONÁRIO #%d:\n", i + 1);
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            funcionarios.add(new Funcionario(id, nome, salario));           
        }

        System.out.print("Qual funcionário você deseja aumentar o salário? ");
        int id = sc.nextInt();
        Funcionario filtrado = funcionarios.stream().filter(x -> x.getId() ==  id).findFirst().orElse(null);

        if(filtrado == null) {
            System.out.println("Este funcionário não consta no cadastro.");
        }
        else {
            System.out.print("Qual a porcentagem do aumento? ");

            int aumento = sc.nextInt();
            filtrado.aumento(aumento);      
        }

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for(Funcionario obj : funcionarios) {
            System.out.println(obj);
        }
        //System.out.println(funcionarios.toString());









        sc.close();
    }
}
