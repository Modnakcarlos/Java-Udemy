package enumeracoesComposicao.exercicioDeFixacao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enumeracoesComposicao.exercicioDeFixacao.entities.departament.Departamento;
import enumeracoesComposicao.exercicioDeFixacao.entities.hourContract.HourContract;
import enumeracoesComposicao.exercicioDeFixacao.entities.worker.Worker;
import enumeracoesComposicao.exercicioDeFixacao.entities.workerLevel.Experiencia;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Adicione o nome do departamento: ");
        String departamento = sc.nextLine();

        System.out.print("Adicione o nome do funcionário: ");
        String name = sc.nextLine();

        System.out.print("Qual o nível de experiência? ");
        String experiencia = sc.nextLine();

        System.out.print("Qual a base salarial? ");
        double salarioBase = sc.nextDouble();

        System.out.print("Quantos contratos o funcionário tem? ");
        int contratos = sc.nextInt();
        sc.nextLine();

        Worker funcionario = new Worker(name, Experiencia.valueOf(experiencia), salarioBase, new Departamento(departamento));

        for(int i = 0; i < contratos; i++) {
            System.out.println("Inserir dados do #" + (i+1) + " contrato");
            System.out.print("Inicio do contrato (dd/MM/YYYY): ");
            Date dataContrato = sdf.parse(sc.next());

            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            System.out.print("Carga horária: ");
            int horasTrabalhadas = sc.nextInt();
            sc.nextLine();

            HourContract contratoAdicionado = new HourContract(dataContrato, valorPorHora, horasTrabalhadas);
            funcionario.addContrato(contratoAdicionado);
        }

        System.out.println();
        System.out.println("Insira o mês para calcular o salario (MM/YYYY): ");
        String mesEAno = sc.nextLine();

        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));

        System.out.print("Nome: " + funcionario.getName());
        System.out.println("Departamento: " + funcionario.getDepartamento().getName());
        System.out.printf("Salário para %s: %.2f", mesEAno, funcionario.income(mes, ano));

        sc.close();
    }
}
