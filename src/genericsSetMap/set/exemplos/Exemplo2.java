package genericsSetMap.set.exemplos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exemplo2 {
    public static void main(String[] args) {

        Set<Integer> a = new HashSet<>(Arrays.asList(1, 3, 12, 4, 11));
        Set<Integer> b = new HashSet<>(Arrays.asList(2, 3, 5, 4, 9));

        //UNIAO
        Set<Integer> c = new HashSet<>(a);
        c.addAll(b);
        System.out.println(c);

        //INTERSECAO
        Set<Integer> d = new HashSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        //DIFERENCA
        Set<Integer> e = new HashSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }
}
