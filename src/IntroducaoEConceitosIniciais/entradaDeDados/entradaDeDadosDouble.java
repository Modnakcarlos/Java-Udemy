package IntroducaoEConceitosIniciais.entradaDeDados;

import java.util.Locale; // se deixar esse recurso desativado, numeros usarão virgula (Padrão Brasil)
import java.util.Scanner;


public class entradaDeDadosDouble {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // se deixar esse recurso desativado, numeros usarão virgula (Padrão Brasil)
        Scanner sc = new Scanner(System.in);

        // Para ler ponto flutuante
        double f;
        f = sc.nextDouble(); // Aqui armazena números com decimais
        System.out.println("Você digitou: " + f);
        System.out.printf("Você digitou %.2f%n", f); // Aparecerá com numeros e vírgula




        sc.close();
    }
}
