package programacaoFuncionalEExpressoesLambda.stream.app;

import programacaoFuncionalEExpressoesLambda.stream.entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgramStream {
    public static void main(String[] args) {

        String paths = "C:\\GG\\int.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(paths))) {

            List<Product> list = new ArrayList<>();
            String file = br.readLine();

            while(file != null) {
                String[] fields = file.split(",");

                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                file = br.readLine();
            }

            double avg = list.stream().map(Product::getPrice).reduce(0.0, Double::sum) / list.size();
            System.out.println("Preço médio: " + String.format("%.2f", avg));
            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(Product::getName)
                    .sorted(comp.reversed())
                    .toList();
            //names.sort(Comparator.comparing(String::toUpperCase));


            //names.stream().sorted(comp.reversed()).toList();
            names.forEach(System.out::println);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
