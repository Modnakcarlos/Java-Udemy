package genericsSetMap.tiposCuringa.Delimitado.exemplo1.app;

import genericsSetMap.tiposCuringa.Delimitado.exemplo1.entities.Shapes.Circle;
import genericsSetMap.tiposCuringa.Delimitado.exemplo1.entities.Shapes.Rectangle;
import genericsSetMap.tiposCuringa.Delimitado.exemplo1.entities.Shapes.Shape;
import genericsSetMap.tiposCuringa.Delimitado.exemplo1.entities.FullSpace;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Vamos calcular áreas e saber a soma de tudo isso!");

        List <Shape> shapes = new ArrayList<>();
        FullSpace fullSpace = new FullSpace();

        shapes.add(new Rectangle(23, 34));
        shapes.add(new Circle(13));
        shapes.add(new Circle(17));

        System.out.println("A área total é " + String.format("%.2f", fullSpace.fullSpace(shapes)));


        sc.close();
    }
}
