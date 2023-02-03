package comportamentoDeMemoriaArraysListas.arrays.listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // Listas só aceitam variáveis do tipo Wrapper, não aceita do tipo primitivo

        list.add("Maria");
        list.add("Alex");
        list.add(2, "Carlos");
        list.add("Josepha");
        list.add("Bob");
        list.add("Anna");


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

    }
}
