package CalculandoEquacaoSegundoGrau;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resp;
        do{
            System.out.println("Vamos calcular a equação do segundo grau de expressões");
            System.out.println("Primeiro informe os coeficientes desejados");

            int a, b, c;
            System.out.print("Coeficiente a:");
            a = sc.nextInt();
            System.out.print("Coeficiente b:");
            b = sc.nextInt();
            System.out.print("Coeficiente c:");
            c = sc.nextInt();

            double delta = (Math.pow(b, 2) - 4 * a * c);
            

            if(delta < 0) {
                System.out.println("Sua equação não possui raízes reais");
            }
            else if(delta == 0) {
                double bhaskara = (- b + Math.sqrt(delta)) / 2 * a;
                System.out.println("Essa expressão possui duas raízes iguais a " + bhaskara);
            }
            else {
                double x1, x2;
                x1 = (- b + Math.sqrt(delta)) / 2 * a;
                x2 = (- b - Math.sqrt(delta)) / 2 * a;
                System.out.println("A equação possui duas raízes distintas");
                System.out.printf("%.1f%n%.1f%n", x1, x2);
            }

            System.out.println("Deseja calcular mais uma raiz quadrada? (s/n)");
            resp = sc.next().charAt(0);

        }
        while (resp != 'n');

        System.out.println("Encerramos as equações");

        sc.close();
    }
}
