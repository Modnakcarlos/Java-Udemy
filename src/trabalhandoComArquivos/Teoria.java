package trabalhandoComArquivos;

import java.io.File;

public class Teoria {
    public static void main(String[] args) {

        //Adicionando arquivos externos dentro da nossa aplicação;

        File arq = new File("C:\\Intel\\texto.txt");

        if(arq.exists())
            System.out.println("Esse arquivo existe");
        else
            System.out.println("Esse arquivo não existe");

        /*
        Existem diversos métodos da classe importada "java.io.File.
        Sempre que adicionarmos arquivos externos dentro do nosso programa, devenmos lançar a
        exceção "IOException", pois podem acontecer erros não ocasionados pelo programador
        problemas no disco rígido por exemplo.
        */
    }
}
