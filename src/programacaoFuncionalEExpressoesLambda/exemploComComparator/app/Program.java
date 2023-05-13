package programacaoFuncionalEExpressoesLambda.exemploComComparator.app;

import programacaoFuncionalEExpressoesLambda.exemploComComparator.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> prod = new ArrayList<>();

        prod.add(new Product("TV", 900.0));
        prod.add(new Product("Notebook", 3200.0));
        prod.add(new Product("Tablet", 2900.0));

        prod.sort(Comparator.comparing(p -> p.getName().toUpperCase()));
        prod.sort(Comparator.comparing(p -> p.getName().toUpperCase()));

        for(Product product : prod) {
            System.out.println(product);
        }

        prod.sort(Comparator.comparing(Product::getPrice));

        for(Product product : prod) {
            System.out.println(product);
        }
    }
}
