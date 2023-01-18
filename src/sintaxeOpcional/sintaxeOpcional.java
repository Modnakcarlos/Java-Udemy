package sintaxeOpcional;

import java.util.Scanner;

public class sintaxeOpcional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual foi o tempo de ligação total?");
        int tempo = sc.nextInt();

        int taxa;

        if (tempo <= 100) {
             System.out.println("Valor a pagar: R$ 50,00");
        } else {
            taxa = (tempo - 100) * 2 + 50;
            
            System.out.println("O valor a ser pago é: " + taxa);
        }








        sc.close();
    }
}
