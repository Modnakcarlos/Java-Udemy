package entradaDeDadosExercicios;

import java.util.Scanner;

public class entradaDeDadosExercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double dinheiroPorHora, salario;
        
        
        System.out.println("Informe o número do funcionário");
        numeroFuncionario = sc.nextInt();
        
        System.out.println("Quantas horas trabalhadas?");
        horasTrabalhadas = sc.nextInt();
        
        dinheiroPorHora = 200.0;
        
        salario = dinheiroPorHora * horasTrabalhadas;
        System.out.println("Funcionário " + numeroFuncionario);
        System.out.println("Seu salário é de " + salario);





        


        sc.close();
    }
}
