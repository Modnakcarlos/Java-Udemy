package estruturaRepetitivaForExercicios;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número para saber seus divisores");

        int valor = sc.nextInt();

        for (int i = 1; i <= valor; i++) {
            if(valor % i == 0) {
            System.out.println(i);
        }
    
        }









        sc.close();
    }
}
