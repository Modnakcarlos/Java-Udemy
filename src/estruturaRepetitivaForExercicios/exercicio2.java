package estruturaRepetitivaForExercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o contador");
        int x = sc.nextInt();

        int countIn = 0;
        int countOut = 0;
        for(int i = 0; i < x; i++) {

            int valores = sc.nextInt();
            
            if(valores >= 10 && valores <= 20) {
                countIn += 1;
            } else {
                countOut += 1;
            }


        }

    System.out.println(countIn + " in");
    System.out.println(countOut + " out");

    sc.close();
    }
}
