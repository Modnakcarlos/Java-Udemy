package estruturaCondicionalExercicios;

import java.util.Scanner;

public class estruturaCondicionalExercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Ler um número e dizer se é ímpar ou par

                
        System.out.println("Insira um número");
        int num = sc.nextInt();
        

        if (num % 2 == 0) {
            System.out.println("Este número é par");
        } else {
            System.out.println("Este número é ímpar");
        }




        sc.close();
    }
}
