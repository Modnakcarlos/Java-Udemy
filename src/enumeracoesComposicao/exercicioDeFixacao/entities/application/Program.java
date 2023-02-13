package enumeracoesComposicao.exercicioDeFixacao.entities.application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enumeracoesComposicao.exercicioDeFixacao.entities.departament.Departamento;
import enumeracoesComposicao.exercicioDeFixacao.entities.worker.Worker;
import enumeracoesComposicao.exercicioDeFixacao.entities.workerLevel.Experiencia;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Adicione o nome do departamento: ");
        String departamento = sc.next();

        System.out.print("Adicione o nome do funcionário");
        String name = sc.nextLine();

        System.out.print("Qual o nível de experiência? ");
        String experiencia = sc.nextLine();

        System.out.print("Qual a base salarial? ");
        double salarioBase = sc.nextDouble();

        System.out.println("Quantos contratos o funcionário tem? ");
        int contratos = sc.nextInt();

        Worker worker = new Worker(name, Experiencia.valueOf(experiencia), salarioBase, new Departamento(departamento));

        for(int i = 0; i < contratos; i++) {
            System.out.println("Inserir dados do #" + i + " contrato");
            Date data = new Date();
        }








        sc.close();
    }
}
