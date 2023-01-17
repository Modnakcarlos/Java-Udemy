package estruturaCondicionalExercicios;

import java.util.Scanner;

public class estruturaCondicionalExercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o código do produto");
        int cod = sc.nextInt();
        System.out.println("Insira a quantidade");
        int quantidade = sc.nextInt();

        double total;
        if (cod == 1) {
            total = quantidade * 4.0;
                   
        } else if (cod == 2) {
            total = quantidade * 4.5;
            
        } else if (cod == 3) {
            total = quantidade * 5.0;
           
        } else if (cod == 4) {
            total = quantidade * 2.0;
        
        } else {
            total = quantidade * 1.5;
        }
        
        System.out.printf("Isso custará %.2f reais", total); 







        sc.close();
    }
}
