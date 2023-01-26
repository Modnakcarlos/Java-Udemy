package exercicios.resolvendoProblemasemOrientacao.triangle;

import java.util.Locale;
import java.util.Scanner;

public class exercicioSemOrientacao {
     public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("insira os dados do primeiro triângulo");

        Triangle x, y;
        x = new Triangle();
        y = new Triangle(); 

        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();


        double p1 = (x.a + x.b + x.c) / 2;
        double areaTriangulo1 = Math.sqrt(p1 * (p1 - x.a) * (p1 - x.b) * (p1 - x.c));

        System.out.println("insira os dados do primeiro triângulo");

        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double p2 = (y.a + y.b + y.c) / 2;
        double areaTriangulo2 = Math.sqrt(p2 * (p2 - y.a) * (p2 - y.b) * (p2 - y.c)); 
        

        System.out.printf("Primeiro triângulo: %.2f%n", areaTriangulo1);
        System.out.printf("Segundo triângulo: %.2f%n", areaTriangulo2);

        if (areaTriangulo1 > areaTriangulo2) {
            System.out.printf("Maior área: %.2f%n", areaTriangulo1);
        } else {
            System.out.printf("maior área: %.2f%n", areaTriangulo2);
        }

        

        


        sc.close();
    }
}
