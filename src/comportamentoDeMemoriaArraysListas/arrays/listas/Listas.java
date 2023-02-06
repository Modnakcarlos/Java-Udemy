package comportamentoDeMemoriaArraysListas.arrays.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // Listas só aceitam variáveis do tipo Wrapper, não aceita do tipo primitivo

        list.add("Maria");
        list.add("Alex");
        list.add(2, "Carlos");
        list.add("Josepha");
        list.add("Bob");
        list.add("Anna");
        list.add("Amanda");



        System.out.println(list.size());

        list.remove("Anna");
        list.remove(2);
        for(String x : list) {
            System.out.println(x);
        }
        System.out.println("-----------------------");

        list.removeIf(x -> x.charAt(0) == 'M');

        for(String x : list) {
            System.out.println(x);
        }

        System.out.println(list.size());

        System.out.println("-----------------------");
        System.out.println("Index of Alex: " + list.lastIndexOf("Alex"));
        System.out.println("Index of Maria: " + list.lastIndexOf("Maria")); // nomes que não existem na lista tem o índice = -1

        // Para fazer um filtro, cria-se uma nova Lista com as condições, bem chato.

        System.out.println("-----------------------");
        List<String> resultadoFiltro = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x : resultadoFiltro) {
            System.out.println(x);
        }

        System.out.println("-----------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        
        System.out.println(name);
        
    }
}
