import java.util.Locale;

public class App {
    public static void main(String[] args) {
        double x = 10.35784;
        String nome = "Carlos Alexandre Sales Silva";
        int idade = 20;
        double renda = 3500.0;
        
        System.out.println(x);
        System.out.printf("%.2f%n", x); // %.2f%n serve para delimitar a quantidade de casas deciamis
        System.out.printf("%.4f%n", x); // Agora foi para 4 casa deciamis
        Locale.setDefault(Locale.US); // deixar caracteres americano padrão (vs code sugere correção)
        System.out.printf("%.4f%n", x);
        System.out.println("Resultado = " + x + " metros");
        System.out.printf("RESULTAADO = %.2f metros%n", x); 

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome, idade, renda); // Formas de concatenar


        // Nome, Idade, Renda, concatenado com printf

        String nome2 = "José da Silva Mota";
        int idade2 = 20;
        double renda2 = 3500.0;

        System.out.printf("%s tem %d anos e recebe %.2f reais como salário %n", nome2, idade2, renda2);
    }
} 





// Tipos primitivos em Java
// Byte
// short
// int
// long
// double
// char
// boolean
