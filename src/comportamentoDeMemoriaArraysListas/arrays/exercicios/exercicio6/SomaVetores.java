package comportamentoDeMemoriaArraysListas.arrays.exercicios.exercicio6;
import java.util.Locale;
import java.util.Scanner;
public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        
        System.out.print("Digite a quantidade de entradas: ");
        n = sc.nextInt();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        
        System.out.println("DIGITE OS VALORES DO VETOR A: ");
        for(int i = 0; i < n; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("DIGITE OS VALORES DO VETOR B: ");
        for(int i = 0; i < n; i++) {
            vetorB[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("VETOR RESULTANTE:");
        
        for(int i = 0; i < n; i++) {
        System.out.printf("%d\n", vetorC[i]);
        }




        sc.close();
    }
}
