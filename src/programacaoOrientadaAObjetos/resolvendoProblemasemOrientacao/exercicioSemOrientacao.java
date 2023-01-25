package programacaoOrientadaAObjetos.resolvendoProblemasemOrientacao;

import java.util.Scanner;

public class exercicioSemOrientacao {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("insira os dados do primeiro triângulo");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double p1 = (a + b + c) / 2;
        double areaTriangulo1 = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));

        System.out.println("insira os dados do primeiro triângulo");

        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        double p2 = (d + e + f) / 2;
        double areaTriangulo2 = Math.sqrt(p2 * (p2 - d) * (p2 - e) * (p2 - f));

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
