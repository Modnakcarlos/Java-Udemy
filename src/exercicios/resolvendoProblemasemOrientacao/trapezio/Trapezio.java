package exercicios.resolvendoProblemasemOrientacao.trapezio;

import java.util.Locale;
import java.util.Scanner;

public class Trapezio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        char termino;
        do {
        System.out.println("Vamos descobrir a medida da área de dois trapézios");
        System.out.println("insira os valores para calcularmos a primeira área");
        

        FuncaoMedidas a, b;

        a = new FuncaoMedidas();
        b = new FuncaoMedidas();

        System.out.print("Indique a altura: ");
        a.altura = sc.nextDouble();
        System.out.print("Indique a base maior: ");
        a.baseMaior = sc.nextDouble();
        System.out.print("Indique a base menor: ");
        a.baseMenor = sc.nextDouble();
        double area1 = (a.baseMaior + a.baseMenor) * a.altura / 2;

        System.out.println("A área desse trapézio mede: " + area1);
        System.out.println("Vamos para o próximo trapézio");

        
        System.out.print("Indique a altura: ");
        b.altura = sc.nextDouble();
        System.out.print("Indique a base maior: ");
        b.baseMaior = sc.nextDouble();
        System.out.print("Indique a base menor: ");
        b.baseMenor = sc.nextDouble();
        double area2 = (b.baseMaior + b.baseMenor) * b.altura / 2;
        System.out.println("A área desse trapézio mede: " + area2);
        System.out.println("Você quer calcular novas áreas? (s/n)?");
        termino = sc.next().charAt(0);
        }
        while (termino != 'n');

        System.out.println("Muito bem, encerramos as atividades!");
        













        sc.close();
    }
}
