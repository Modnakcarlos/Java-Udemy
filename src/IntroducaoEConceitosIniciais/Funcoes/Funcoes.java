package IntroducaoEConceitosIniciais.Funcoes;

import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("adicione três números");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max(a, b, c);

        mostrarResultado(maior);

        sc.close();
    } 

    public static int max(int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        } else if (b > c) {
            aux = b;    
        } else {
            aux = c;
        }
        return aux;
    }

    public static void mostrarResultado(int valor) {
        System.out.println("maior número: " + valor);
    }
}
