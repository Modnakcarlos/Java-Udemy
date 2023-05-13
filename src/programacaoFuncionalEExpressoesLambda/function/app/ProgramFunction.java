package programacaoFuncionalEExpressoesLambda.function.app;

import programacaoFuncionalEExpressoesLambda.function.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramFunction {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 3200.0));
        list.add(new Product("Tablet", 90.0));
        list.add(new Product("Camera", 50.0));

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        List<String> namess = list.stream().map(p -> p.getName().toUpperCase()).toList();



        List<String> nome = list.stream().map(p -> p.getName().toUpperCase()).toList();

        names.forEach(System.out::println);
        System.out.println();
        namess.forEach(System.out::println);
        System.out.println();
        nome.forEach(System.out::println);



    }
}
