package programacaoFuncionalEExpressoesLambda.criandoFuncoesComFuncoes.entities;

import programacaoFuncionalEExpressoesLambda.criandoFuncoesComFuncoes.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double soma = 0;
        for (Product product : list) {
            if(criteria.test(product)) {
                soma += product.getPrice();
            }
        }
        return soma;
    }
}
