package herancaEPolimorfismo.exercicio2.application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import herancaEPolimorfismo.exercicio2.entities.ImportedProduct;
import herancaEPolimorfismo.exercicio2.entities.Product;
import herancaEPolimorfismo.exercicio2.entities.UsedProduct;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Product> list = new ArrayList<>();

    System.out.print("Enter the number of products: ");
    int n = sc.nextInt();
    sc.nextLine();

    for(int i = 0; i < n; i++) {
        System.out.println("Product #" + (i+1) + " data: ");

        System.out.println("Common, used or imported (c/u/i): ");
        char t = sc.next().charAt(0);
        sc.nextLine();
        
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        if(t == 'i') {
            System.out.print("Customs fee: ");
            double customsFee = sc.nextDouble();

            list.add(new ImportedProduct(name, price, customsFee));
        }
        else if(t == 'c') {
            list.add(new Product(name, price));
        }
        else {
            
            System.out.print("Manufacture date (DD/MM/YYYY): ");
            LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/YYYY"));
            sc.nextLine();

            list.add(new UsedProduct(name, price, manufactureDate));
        }
    }

    System.out.println();
    for(Product h : list){
        System.out.println(h.priceTag());
    }

        sc.close();
    }
}
