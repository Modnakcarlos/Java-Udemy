package estruturaRepetitivaForExercicios;

import java.util.Scanner;

public class estruturaRepetitivaForExercicio {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int entradas = sc.nextInt();

        int soma = 0;

        for(int i = 0; i <= entradas; i++) {
            
            int valores = sc.nextInt();
            soma += valores;

        }



        sc.close();
    }
}
