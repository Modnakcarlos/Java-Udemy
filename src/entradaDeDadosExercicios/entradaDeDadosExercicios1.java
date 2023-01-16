package entradaDeDadosExercicios;

import java.util.Scanner;

public class entradaDeDadosExercicios1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a, b, soma;

        System.out.println("Digite um valor");
        
        a = sc.nextInt();
        
        System.out.println("Digite outro valor");

        b = sc.nextInt();
        
        soma = a + b;

        System.out.println("A soma dos valores " + a + " mais o valor " + b + " é igual a " + soma);
    
    
    
        sc.close();    
    }
}
