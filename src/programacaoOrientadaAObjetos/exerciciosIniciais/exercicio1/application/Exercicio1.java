package programacaoOrientadaAObjetos.exerciciosIniciais.exercicio1.application;

import java.util.Locale;
import java.util.Scanner;

import programacaoOrientadaAObjetos.exerciciosIniciais.exercicio1.entities.Retangle;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangle retangulo = new Retangle(); 

        System.out.println("Adicione as medidas do seu retângulo");
        System.out.print("Largura: ");
        retangulo.largura = sc.nextDouble();
        
        System.out.print("Altura: ");
        retangulo.altura = sc.nextDouble();

        System.out.println("A área do seu retângulo é de: " + retangulo.area());
        System.out.println("O perímetro do seu retângulo é de: " + retangulo.perimetro());
        System.out.println("A diagonal do seu retângulo mede: " + retangulo.diagonal());
        







        sc.close();
    }
}
