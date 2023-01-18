package sintaxeOpcional;

import java.util.Scanner;

public class condicionalTernaria {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double preco = 34.45;
        double desconto = (preco <20.0) ? preco * 0.1 : preco * 0.05;

        System.out.printf("%.2f%n", desconto);


        double peso = sc.nextDouble();
        String resposta = (peso > 80.0) ? "Sua baleia, vai emagrecer seu gordo obeso" : "Tá quase virando uma porta de tão gorda, hein bicha";

        System.out.println(resposta);




        sc.close();
    }
}
