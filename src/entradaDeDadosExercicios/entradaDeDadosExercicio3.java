package entradaDeDadosExercicios;

import java.util.Scanner;

public class entradaDeDadosExercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double A, B, C, D, diferenca;

        System.out.println("Informe 4 valores");
        
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        D = sc.nextDouble();

        diferenca = ((A * B) - (C * D));

        System.out.println("DIferença: " + diferenca);
        
        
        sc.close();
    }
}
