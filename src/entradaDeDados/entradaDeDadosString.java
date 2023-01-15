package entradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class entradaDeDadosString {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String x; // Aqui armazena somente texto, simples, mas importante lembrar
        x = sc.next(); // Adiciona entrada, teclado (Input), mas precisa de toda confugração de scaner
        System.out.println("Você digitou: " + x);
        
        
    
        
        


        // Para ler ponto flutuante
        double f;
        f = sc.nextDouble(); // Aqui armazena números com decimais
        System.out.println("Você digitou: " + f);
    




        sc.close();
    }
    
}
