package programacaoOrientadaAObjetos.exerciciosIniciais.exercicio3.application;

import java.util.Locale;
import java.util.Scanner;



import programacaoOrientadaAObjetos.exerciciosIniciais.exercicio3.entities.Notas;

public class Exercicio3{
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Notas notas = new Notas();
        
        System.out.print("Insira o nome do aluno: ");
        notas.nome = sc.nextLine();

        System.out.println("Insira as notas do aluno: ");
        notas.nota1 = sc.nextDouble();
        notas.nota2 = sc.nextDouble();
        notas.nota3 = sc.nextDouble();

        System.out.println("Sua nota final foi " + notas.notaFinal());

        if(notas.notaFinal() < 60) {
            System.out.println("Reprovado");
            System.out.println("Faltam " + notas.notaParaMedia() + " para você ser aprovado");
        } else {
            System.out.println("APROVADO");
        }

        sc.close();
    }
}
