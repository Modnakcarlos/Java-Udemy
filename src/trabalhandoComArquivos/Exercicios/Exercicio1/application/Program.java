package trabalhandoComArquivos.Exercicios.Exercicio1.application;

import trabalhandoComArquivos.Exercicios.Exercicio1.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> prod = new ArrayList<>();
        System.out.print("Quantos itens deseja adicionar? ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Adicione informações do pedido:");
        for(int i = 0; i < n; i++) {

            System.out.print("Name product: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            prod.add(new Product(name, price, quantity));
        }

        System.out.print(prod);
    }
}
