package herancaEPolimorfismo.exercicio3.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import herancaEPolimorfismo.exercicio3.entities.Circle;
import herancaEPolimorfismo.exercicio3.entities.Color;
import herancaEPolimorfismo.exercicio3.entities.Rectangle;
import herancaEPolimorfismo.exercicio3.entities.Shape;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int shapes = sc.nextInt();
        sc.nextLine();

        List<Shape> shape = new ArrayList<>();

        for(int i = 0; i < shapes; i++) {
            System.out.println("Shape #" + (i+1) + " data: ");

            System.out.print("Rectangle or circle (r/c)? ");
            char s = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if(s =='c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                shape.add( new Circle(color, radius));
            }
            else {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                shape.add(new Rectangle(color, width, height));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
            
        for(Shape shapee : shape) {
            System.out.println(String.format("%.2f", shapee.area()));
        }
        sc.close();
    }
}
