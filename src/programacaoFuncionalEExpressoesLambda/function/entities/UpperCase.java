package programacaoFuncionalEExpressoesLambda.function.entities;

import java.util.function.Function;

public class UpperCase implements Function<Product, String> {

    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
