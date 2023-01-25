package IntroducaoEConceitosIniciais.estruturaRepetitivaForExercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de casos desejados");
        int casos = sc.nextInt();



        for (int i = 0; i < casos; i ++) {
            System.out.println("Você terá " + casos + " casos para calcular a média ponderada.");
            System.out.println("Novo caso, insira 3 valores");
            
            
            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double C = sc.nextDouble();

            double mediaPonderada = (A * 2) + (B * 3) + (C * 5)/ (10);
            System.out.println("média ponderada dos valores informados " + mediaPonderada);
            


        }

        sc.close();
    }
}
