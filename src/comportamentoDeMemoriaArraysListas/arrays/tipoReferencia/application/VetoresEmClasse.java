package comportamentoDeMemoriaArraysListas.arrays.tipoReferencia.application;

import java.util.Locale;
import java.util.Scanner;

import comportamentoDeMemoriaArraysListas.arrays.tipoReferencia.entities.Products;

public class VetoresEmClasse {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("inserir valor");

        int n = sc.nextInt();

        Products[] produto = new Products[n]; 

        for(int i = 0; i<produto.length; i++) {

            sc.nextLine();
            System.out.print("Nome do produto:");
            String nome = sc.nextLine();
            System.out.print("Preço do produto: ");
            double price = sc.nextDouble();
            produto[i] = new Products(nome, price);
        }

        double soma = 0.0;
        for(int i = 0; i < produto.length; i++) {
            soma += produto[i].getPrice();
        }

         double media = soma / produto.length;

         System.out.printf("Media: %.2f%n", media);
        sc.close();
    }
}
