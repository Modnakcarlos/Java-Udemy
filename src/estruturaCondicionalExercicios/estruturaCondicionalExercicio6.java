package estruturaCondicionalExercicios;

import java.util.Scanner;

public class estruturaCondicionalExercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        
    
        
        if (x > 0 && x <= 25)  
        System.out.printf("Intervalo [0,25]");

        else if (x > 25 && x <= 50) 
        System.out.printf("Intervalo (25,50]");
        else if (x > 50 && x <= 75) 
        System.out.printf("Intervalo (50,75]");
        else if (x > 75 && x <= 100) 
        System.out.printf("Intervalo (75,100]");
        else 
            System.out.println("Fora de intervalo");

 

        sc.close();
    }
}
