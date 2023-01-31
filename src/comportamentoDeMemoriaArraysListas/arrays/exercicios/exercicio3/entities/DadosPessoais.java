package comportamentoDeMemoriaArraysListas.arrays.exercicios.exercicio3.entities;

public class DadosPessoais {
    private String nome;
    private int idade;
    private double altura;


    public DadosPessoais(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String toString() {
        return "Os valores são" + nome + idade + altura;
    }

}
