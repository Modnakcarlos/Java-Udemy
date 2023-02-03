package comportamentoDeMemoriaArraysListas.arrays.exercicios.desafio.entities;

public class Data {
    
    private String nome;
    private String email;

    public Data() {
    }
    
    public Data(String _nome, String _email) {
        this.nome = _nome;
        this.email = _email;
        
    }

    public void setNome(String _nome) {
        this.nome = _nome;
    }

    public String getName() {
        return nome;
    }
    public void setEmail(String _email) {
        this.email = _email;
    }

    public String getEmail() {
        return email;
    }

   

    //public int quartosAlugados(int _quartoOcupado) {
    //    return 
    //}

    public String toString() {
        return  ": " + nome + ", " + email;
    }

}
