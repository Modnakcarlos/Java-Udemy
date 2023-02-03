package comportamentoDeMemoriaArraysListas.arrays.boxingUnboxingWrapperClasses;


public class teoria {
    /*
    Converter obj em variável e converter variável em obj; 
    */


    /*
     * Wrapper classes serve para criar tipos em classes, não como tipo primitivo, usa-se novos nomes de variáveis.
     * 
     */
    public static void main(String[] args) {

        int x = 2;
        Object obj = x;

        System.out.println(obj);


        int y = (int) obj; // casting para a máquina entender;
        System.out.println(y);

    
        // CASO NÃO QUEIRA FAZER CASTING, OU MELHOR ORGANIZAÇÃO DO CÓDIGO:

        int a = 20;
        Integer obj1 = a;

        System.out.println(obj1);
    
        int b = obj1 * 2;

        System.out.println(b);
    
    
    
    
    }

    


}
