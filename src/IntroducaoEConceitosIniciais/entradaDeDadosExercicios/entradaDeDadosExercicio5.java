package IntroducaoEConceitosIniciais.entradaDeDadosExercicios;

import java.util.Scanner;

public class entradaDeDadosExercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int cod1, cod2, qtd1, qtd2;
        double valorUnidade1, valorUnidade2, total;
        
        System.out.println("Escolha um produto");
        cod1 = sc.nextInt();
        System.out.println("Quantas unidades?");
        qtd1 = sc.nextInt();
        valorUnidade1 = 35.0;

        System.out.println("Escolha um produto");
        cod2 = sc.nextInt();
        System.out.println("Quantas unidades?");
        qtd2 = sc.nextInt();
        valorUnidade2 = 70.0;
        
        total = valorUnidade1 * qtd1 + valorUnidade2 * qtd2;

        System.out.println("O " + cod1 + " Custa " + valorUnidade1 + ". " + cod2 + " Custa " + valorUnidade2);
        System.out.println("Seu sub total é de " + total);
    

    
        sc.close();
    }
}
