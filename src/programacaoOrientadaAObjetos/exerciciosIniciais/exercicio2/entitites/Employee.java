package programacaoOrientadaAObjetos.exerciciosIniciais.exercicio2.entitites;

public class Employee {
    public String nome;
    public Double salarioBruto;
    public double desconto;

    public double salarioLiquido() {
        return salarioBruto * (1 - desconto);
    }

    public void 
}
