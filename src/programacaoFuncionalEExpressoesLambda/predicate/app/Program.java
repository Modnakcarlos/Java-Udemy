package programacaoFuncionalEExpressoesLambda.predicate.app;

import programacaoFuncionalEExpressoesLambda.predicate.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list .add(new Product("TV", 900.0));
        list .add(new Product("Notebook", 3200.0));
        list .add(new Product("Tablet", 2900.0));
        list .add(new Product("Camera", 50.0));

        list.removeIf(p -> p.getPrice() >= 100);

        for(Product p : list) {
            System.out.println(p);
        }
    }
}
