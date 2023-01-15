package entradaDeDados2;

import java.util.Scanner;

public class entradaDeDadosStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        // E se eu quiser colocar um número no meio da chamada?
        
        x = sc.nextInt(); // Quando se coloca um número, a quebra de texto não é aplicada à sua linha, então
        sc.nextLine();       // é necessário adicionar um sc.nextLine(), pois assim ela não vai ignorar a variável seguinte (s1)
        s1 = sc.nextLine(); // nextLine() serve para ler a linha inteira!!!
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
     
}