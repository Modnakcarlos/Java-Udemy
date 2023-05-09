package genericsSetMap.genericosDelimitados.application;

import genericsSetMap.genericosDelimitados.entities.CalculationService;
import genericsSetMap.genericosDelimitados.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> product = new ArrayList<>();
        String arquivo = "C:\\Nova pasta\\int.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String products = br.readLine();
            while(products != null) {
                String[] fields = products.split(",");
                product.add(new Product(fields[0], Double.parseDouble(fields[1])));
                products = br.readLine();
            }

            Product max = CalculationService.max(product);

            System.out.println("O maior da lista acima, pelo preço, é: ");
            System.out.println(max);

            System.out.println("Usando Colections.max");
            Product sc = Collections.max(product);
            System.out.println(sc);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
