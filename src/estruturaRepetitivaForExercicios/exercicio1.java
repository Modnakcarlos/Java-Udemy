package estruturaRepetitivaForExercicios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor de 1 até 1000");
        int valor = sc.nextInt();
        
        while(!(valor >= 1 && valor <= 1000)) {
                System.out.println("Por favor, insira valor válido");
                valor = sc.nextInt();
            }
                
        if(valor >= 1 && valor <= 1000) {
            
            for(int i = 0; i < valor; i++) {
                
                if(i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        

        /* 
        int x = sc.nextInt();
        
        
        for(int i = 0; i < x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

*/
        sc.close();
    }
}
