package entradaDeDadosExercicios;

import java.util.Scanner;

public class entradaDeDadosExercicio2 {
    public static void main(String [] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double raio, S, pi = 3.12;

        System.out.println("Informe o valor do raio");
        
        raio = sc.nextDouble();
        S = raio * raio * pi;
        System.out.println("A área do círculo cujo raio mede " + raio + ", mede " + S);





        sc.close();
    }
}
