package genericsSetMap.set.exercicio.app;

import genericsSetMap.set.exercicio.entities.Cursos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Cursos> A = new HashSet<>();
        Set<Cursos> B = new HashSet<>();
        Set<Cursos> C = new HashSet<>();

        System.out.print("Quantos alunos são do curso A? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.print("Código de acesso do Aluno: ");
            int code = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome do aluno: ");
            String name = sc.nextLine();

            A.add(new Cursos(code, name));
        }

        System.out.println("Alunos do curso A cadastrados com sucesso!");
        System.out.println("Quantos alunos são do curso B? ");
        n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.print("Código de acesso do Aluno: ");
            int code = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome do aluno: ");
            String name = sc.nextLine();

            B.add(new Cursos(code, name));
        }

        System.out.println("Alunos do curso B cadastrados com sucesso!");
        System.out.println("Quantos alunos são do curso C? ");
        n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.print("Código de acesso do Aluno: ");
            int code = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome do aluno: ");
            String name = sc.nextLine();

            C.add(new Cursos(code, name));
        }

        Set<Cursos> total = new HashSet<>();
        total.addAll(A);
        total.addAll(B);
        total.addAll(C);


        System.out.println("Total de alunos: " + total.size());

        System.out.println(total);

        sc.close();
    }
}
