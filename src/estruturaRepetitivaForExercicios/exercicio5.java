package estruturaRepetitivaForExercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor que queira saber o fatorial");
        int valor = sc.nextInt();
        int produto = 1;

        for (int i = 1; i <=valor; i++) {
            produto *= i;
        }

        System.out.println("O fatorial de " + valor + " é " + produto);












        sc.close();
    }
}
