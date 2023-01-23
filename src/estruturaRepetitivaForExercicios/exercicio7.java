package estruturaRepetitivaForExercicios;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int numero = i;
            int quadrado = i * i;
            int cubo = i * i * i;

            System.out.printf("%d %d %d%n", numero, quadrado, cubo );

        }






        
        
        
        
        sc.close();
    }
}
