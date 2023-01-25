package IntroducaoEConceitosIniciais.estruturaRepetitivaForExercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicioDoWhile {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;
        do {
        System.out.println("Insira uma temperatura em celsius para transformar em farenheit");
        double tempCelsius = sc.nextDouble();

        double tempFarenheit = (9 * tempCelsius / 5) + 32;
        System.out.printf("A temperatura em farenheit é %.1f%n", tempFarenheit);
        System.out.println("Gostaria de continuar? (s/n)");
        resp = sc.next().charAt(0);
    } while (resp != 'n');


    System.out.println("Programa encerrado.");


        







        sc.close();
    }
}
