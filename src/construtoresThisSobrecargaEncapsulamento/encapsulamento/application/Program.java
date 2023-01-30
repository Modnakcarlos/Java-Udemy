package construtoresThisSobrecargaEncapsulamento.encapsulamento.application;

import java.util.Locale;
import java.util.Scanner;

import construtoresThisSobrecargaEncapsulamento.encapsulamento.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product produto = new Product(name, price);

        produto.setName("PlayStation 5"); 
        // Se quisermos chamar um objeto privado, teremos que usar getName
        System.out.println("atualização do nome: " + produto.getName());

        System.out.println();
        
        System.out.println("Product data: " + produto);
        
        System.out.print("Enter the number of products to be added in stock: " );
        quantity = sc.nextInt();
        produto.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + produto);

        System.out.print("Enter the number to be remove in stock: ");
        quantity = sc.nextInt();
        produto.removeProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + produto);





        

         
        sc.close();
    }
}

