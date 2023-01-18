package estruturaRepetitivaWhileExercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu tipo de combustível");
        System.out.println("1: Álcool | 2: Gasolina | 3: Diesel | 4: Fim"); 
        int cod = sc.nextInt();
        int alcoolTotal, gasolinaTotal, dieselTotal;
        alcoolTotal = 0;
        gasolinaTotal = 0;
        dieselTotal = 0;

        while (cod != 4) {
            
            if (cod == 1) {
                alcoolTotal += 1;
            }
            else if (cod == 2) {
                gasolinaTotal += 1;
            }
            else if (cod == 3) {
                dieselTotal += 1;
            }
            else {
            System.out.println("Insira valor válido");
            }

            System.out.printf("Álcool: %d%nGasolina: %d%nDiesel: %d%n", alcoolTotal, gasolinaTotal, dieselTotal);

            cod = sc.nextInt();
        

        }   

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Álcool: %d%nGasolina: %d%nDiesel: %d%n", alcoolTotal, gasolinaTotal, dieselTotal);



        sc.close();
    }
}
