package genericsSetMap.introducao.exemplo;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T> {

    private List <T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }

    public T first() {

        if(list.isEmpty()) {
            throw new IllegalStateException("Lista vazia!!!");
        }
        return list.get(0);
    }

    public void print() {
        for(T e : list) {
            System.out.print(e + ", ");

        }
    }
}
