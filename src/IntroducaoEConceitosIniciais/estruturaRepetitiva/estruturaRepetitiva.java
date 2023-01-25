package IntroducaoEConceitosIniciais.estruturaRepetitiva;

import java.util.Scanner;

public class estruturaRepetitiva {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        
        int soma = 0;
        while (x != 0) {
            soma += x;
            x = sc.nextInt();
            
        }

        System.out.printf("Somando os resultados, obtém-se %d%n", soma);










        sc.close();
    }
}
