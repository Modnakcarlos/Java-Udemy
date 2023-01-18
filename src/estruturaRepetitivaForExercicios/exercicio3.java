package estruturaRepetitivaForExercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de casos desejados");
        int casos = sc.nextInt();

        double A = 0;
        double B = 0;
        double C = 0; 
        double mediaPonderada = 0;


        for (int i = 0; i < casos; i ++) {
            System.out.println("Você terá " + casos + " casos para calcular a média ponderada.");
            System.out.println("Novo caso, insira 3 valores");
            
            
            A = sc.nextDouble();
            B = sc.nextDouble();
            C = sc.nextDouble();

            mediaPonderada = (A * 2) + (B * 3) + (C * 5)/ (10);
        }

        
        System.out.println("média ponderada dos valores informados " + mediaPonderada);








        sc.close();
    }
}
