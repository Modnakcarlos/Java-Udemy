package genericsSetMap.tiposCuringa.Delimitado.entities;

import genericsSetMap.tiposCuringa.Delimitado.entities.Shapes.Shape;

import java.util.List;

public class FullSpace {
    public double fullSpace(List<? extends Shape> list) {
        double soma = 0;
        for(Shape c : list) {
            soma += c.area();
        }
            /*
            Para poder fazer o laço "for(Shape c : list) {...", dentro do parâmetro recebido pela função, a lista deve ser
            "List<? extends outra superclasse> list" (Mais uma vez, dentro do parâmetro na introdução do método;
            */
        return soma;
    }

    /*
    NÓS NÃO CONSEGUIREMOS ADICIONAR ELEMENTOS A LISTA SE TIVER O TIPO CORINGA;
     */

}
