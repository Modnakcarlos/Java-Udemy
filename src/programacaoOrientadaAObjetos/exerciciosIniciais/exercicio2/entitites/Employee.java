package programacaoOrientadaAObjetos.exerciciosIniciais.exercicio2.entitites;

public class Employee {
    public String nome;
    public Double salarioBruto;
    public double desconto;

    public double salarioLiquido() {
        return salarioBruto  - desconto;
    }

    public void aumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }

    public String toString() {
        return "Funcionário: " + nome + ", $ " + String.format("%.2f", salarioLiquido());
    }
}
