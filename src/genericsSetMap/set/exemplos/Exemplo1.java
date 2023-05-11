package genericsSetMap.set.exemplos;

import java.util.HashSet;
import java.util.Set;

public class Exemplo1 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Gilmar");
        set.add("Bianca");
        set.add("Milano");

        System.out.println(set.contains("Bianca"));

        set.remove("Bianca");

        System.out.println(set.contains("Bianca"));

        set.removeIf(x -> x.charAt(0) == 'M');

        for (String e : set) {
            System.out.println(e);
        }
    }
}
