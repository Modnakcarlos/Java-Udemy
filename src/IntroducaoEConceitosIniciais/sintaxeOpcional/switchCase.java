package IntroducaoEConceitosIniciais.sintaxeOpcional;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        switch(x) {
            case 1:
                dia = "Domingo!";
                break;
            case 2:
                dia = "Segunda-feira!";
                break;
            case 3:
                dia = "Terça-feira!" ;
                break;
            case 4:
                dia = "Quarta-feira!";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira!";
                break;
            case 7:
                dia = "Sábado!";
                break;
            default:
                dia = "Valor inválido";
                break;

        }

    
        System.out.printf("Dia da semana: %s%n", dia);




        sc.close();
    }
}