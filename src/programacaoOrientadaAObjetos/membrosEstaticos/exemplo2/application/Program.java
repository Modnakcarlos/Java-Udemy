package programacaoOrientadaAObjetos.membrosEstaticos.exemplo2.application;

import java.util.Locale;
import java.util.Scanner;

import programacaoOrientadaAObjetos.membrosEstaticos.exemplo2.calculos.CurrencyConverter;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Qual o preço do dolar?");
        double valor = sc.nextDouble();

        System.out.print("Quantos dólares vc deseja comprar? (Considere IOF de 6%): ");
        double quantidade = sc.nextDouble();

        System.out.printf("Você deverá pagar, em reais, o valor de %.2f%n", CurrencyConverter.valorFinal(valor, quantidade));

   
        sc.close();
    }
}
