package comportamentoDeMemoriaArraysListas.arrays.listas.exercicios.exercicio1.entities;

public class Cliente {
    private Integer id;
    private String nome;
    private Integer idade;
    private Long telefone;

    public Cliente() {
    }

    public Cliente(Integer id, String nome, Integer idade, Long telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String toString() {
        return id + ", " + nome + ", " + idade + " anos, " + "telefone: " + telefone;
    }

}
