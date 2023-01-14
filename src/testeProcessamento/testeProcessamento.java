package testeProcessamento;

public class testeProcessamento {
    public static void main(String[] args) {

    // EXEMPLO 1
        int x, y;

        x = 5;

        y = 2* x;

        System.out.println(x);
        System.out.println(y);
    
    // EXEMPLO 2

        int a;
        double b; // como o b é tipo double, ele aparece no terminal com casa decinmal!
        a = 5;

        b = 2 * x;

        System.out.println(a);
        System.out.println(b);

    // EXEMPLO 3
        // Calcular área do trapézio
    
        int baseMaior, baseMenor, altura, areaDoTrapezio;
            baseMaior = 8;
            baseMenor = 6;
            altura = 5;
            areaDoTrapezio = (baseMaior + baseMenor) / 2 * altura;
        
        System.out.printf("A área calculada do trapézio, cujos lados medem %d, %d e altura %d, é %d%n", baseMaior, baseMenor, altura, areaDoTrapezio);

    // EXEMPLO 4

        int c, d;
        double resultado;

            c = 5;
            d = 2;

        resultado = (double) c / d; //CASTING: CONVERSÃO EXPLÍCITA DOS VALORES

        System.out.println(resultado);
        // mesmo que a variavel resultado esteja tipada como double, seu resultado será um número inteiro, pois
        // a variáveis usadas para o cáculo são do tipo int
        // para resolver isso, basta alterar o código para resultado (double) c / d
        // Não seria mais simples adotar o double como tipo padrão para valores?

        // EXEMPLO 4

            double e;
            int f;
            e = 5.0;
            f = (int) e; // antes ficava b = a
            System.out.println(f);
            // para resolver isso, basta alterar o código para resultado b = (int a)
    }
    
}
 