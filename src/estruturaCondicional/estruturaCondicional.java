package estruturaCondicional;

import java.util.Scanner;

public class estruturaCondicional {
    public static void main(String[] args) {
        // símbolos de expressões lógicas: && || !, respectivamente, "E" "OU" "NÃO"

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Este número é negativo");
        } else {
            System.out.println("Este número é positivo");
        }



        sc.close();
    }
}
