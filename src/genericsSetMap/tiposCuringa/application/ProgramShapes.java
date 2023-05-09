package genericsSetMap.tiposCuringa.application;

import java.util.Arrays;
import java.util.List;

public class ProgramShapes {
    public static void main(String[] args) {
        List <Integer> number = Arrays.asList(5, 10, 12);
        printList(number);

        List <String> names = Arrays.asList("Carlos", "João", "Bia");
        printList(names);

    }

    /*
    agora o método vai conseguir imprimir listas de qualquer tipo, não precisando criar um método de impressão para
    todos os tipos de listas. MAS NÃO PODEMOS ADICIONAR ELEMENTOS NOS TIPO CURINGA.
     */
    public static void printList(List<?> list) {
        for(Object e : list) {
            System.out.println(e);
        }
    }
}
