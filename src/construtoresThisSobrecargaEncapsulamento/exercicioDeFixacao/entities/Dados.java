package construtoresThisSobrecargaEncapsulamento.exercicioDeFixacao.entities;

public class Dados {
    private int numeroConta;
    private String nome;
    private double saldo;

    public Dados() {        
    }
    
    public Dados(int numeroConta, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Dados(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public void Setnome(String nome) {
        this.nome = nome;
    }

    public String getNomeString() {
        return nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        return "Conta: " 
        + numeroConta 
        + ", Usuário: " 
        + nome 
        + ", Saldo: R$ "
        + saldo;
    }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }

    public void sacar(double saldo) {
        this.saldo -= saldo + 5;
    }




}
