package programacaoFuncionalEExpressoesLambda.criandoFuncoesComFuncoes.app;

import programacaoFuncionalEExpressoesLambda.criandoFuncoesComFuncoes.entities.ProductService;
import programacaoFuncionalEExpressoesLambda.criandoFuncoesComFuncoes.entities.Product;


import java.util.ArrayList;
import java.util.List;

public class AppFuncoesComFuncoes {
    public static void main(String[] args) {
        List<Product> listas = new ArrayList<>();

        listas.add(new Product("TV", 900.0));
        listas.add(new Product("Notebook", 3200.0));
        listas.add(new Product("Tablet", 90.0));
        listas.add(new Product("Camera", 50.0));
        listas.add(new Product("Mouse", 50.0));
        listas.add(new Product("Impressora", 1000.0));
        listas.add(new Product("Case HD", 100.0));

        ProductService ps = new ProductService();

        double soma = ps.filteredSum(listas, p -> p.getName().toUpperCase().charAt(0) == 'C');

        System.out.println(soma);
    }
}
