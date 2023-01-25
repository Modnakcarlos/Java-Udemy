package IntroducaoEConceitosIniciais.entradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class entradaDeDadosInt {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Para ler numeros inteiros
        int y;
        y = sc.nextInt(); // Aqui armazena números com decimais
        System.out.println("Você digitou: " + y);


        sc.close();
    }
}
