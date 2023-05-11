package genericsSetMap.tiposCuringa.Delimitado.exemplo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        /*

         */

        List<Integer> myInts = Arrays.asList(1, 2 , 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        System.out.println(myObjs);

        copy(myDoubles, myObjs);
        System.out.println(myObjs);

    }
    public static void copy(List<? extends Number> source, List<? super Object> target) {
        for(Object e : source) {
            target.add(e);
        }
    }
}
