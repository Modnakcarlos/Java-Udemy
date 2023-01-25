package IntroducaoEConceitosIniciais.entradaDeDadosExercicios;

import java.util.Scanner;

public class entradaDeDadosExercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A, B, C;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();


        double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        areaTriangulo = A * C /2;
        areaCirculo = C * C * 3.14;
        areaTrapezio = (A + B) * C /2;
        areaQuadrado = B * B;
        areaRetangulo = A * B;

        System.out.println("TRIÂNGULO: " + areaTriangulo);
        System.out.println("CÍRCULO: " + areaCirculo);
        System.out.println("TRAPÉZIO: " + areaTrapezio);
        System.out.println("QUADRADO " + areaQuadrado);
        System.out.println("RETÂNGULO " + areaRetangulo);
    

        sc.close();
    }
}
