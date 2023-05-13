package programacaoFuncionalEExpressoesLambda.consumer.app;

import programacaoFuncionalEExpressoesLambda.consumer.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> lista = new ArrayList<>();

        lista.add(new Product("TV", 900.0));
        lista.add(new Product("Notebook", 3200.0));
        lista.add(new Product("Tablet", 90.0));
        lista.add(new Product("Camera", 50.0));

        lista.forEach(p -> p.setPrice(p.getPrice() * 1.1));

        //Nesse casi, imprimindo a lista usando forEach:
        lista.forEach(System.out::println);

        //aqui ta implementando uma mudança, e não criando uma cópia de lista
        lista.forEach(p -> p.setName(p.getName().toUpperCase()));
        for (Product p : lista) {
            System.out.println(p.getName());
        }


    }
}
