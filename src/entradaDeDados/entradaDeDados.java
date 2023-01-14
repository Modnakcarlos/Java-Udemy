package entradaDeDados;

import java.util.Scanner;

public class entradaDeDados {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String x; // Aqui armazena somente texto, simples, mas importante lembrar
        x = sc.next(); // Adiciona entrada, teclado (Input), mas precisa de toda confugração de scaner
        System.out.println("Você digitou: " + x);
        
        
    
        
        // Para ler numeros inteiros
        int y;
        y = sc.nextInt(); // Aqui armazena números com decimais
        System.out.println("Você digitou: " + y);


        // Para ler ponto flutuante
        double f;
        f = sc.nextDouble(); // Aqui armazena números com decimais
        System.out.println("Você digitou: " + f);
    




        sc.close();
    }
    
}
