package programacaoOrientadaAObjetos.exerciciosIniciais.exercicio1.entities;

public class Retangle {
    public double largura;
    public double altura;


    public double area() {
    return largura * altura;
    }

    public double perimetro() {
    return 2 * altura + 2 * largura;
    }

    public double diagonal() {
    return Math.sqrt((Math.pow(largura, 2) + Math.pow(altura, 2)));
    }

}