package programacaoOrientadaAObjetos.membrosEstaticos.exemplo1.application;

import java.util.Locale;
import java.util.Scanner;

import programacaoOrientadaAObjetos.membrosEstaticos.exemplo1.util.Calculator;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o raio: ");
        double raio = sc.nextDouble();

        double c = Calculator.cinrcunferencia(raio);

        double v = Calculator.volume(raio);

        System.out.printf("Valor da circunferência: %.2f%n", c);
        System.out.printf("Valor do volume: %.2f%n", v);
        System.out.printf("O valor de PI é: ", Calculator.PI);

        
        sc.close();
    
    }
    
}
