package comportamentoDeMemoriaArraysListas.arrays.exercicios.desafio2.entities;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void aumento(double porcentagem) {
        salario += salario * porcentagem / 100;
    }
    
    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }

    

}
