package funcoesMatematicasEmJava;

public class funcoesMatematicasEmJava {
    public static void main(String[] args) {
        
        double x = 3.0; // valores iniciais
        double y = 4.0; // valores iniciais
        double z = -5.0; // valores iniciais
        double A, B, C; // onde será armazenados os valores de x, y, z

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 " + " = " + C);

        A = Math.pow(x, y);
        B = Math.pow(y, 2.0);
        C = Math.pow(z, -5);

        System.out.println(x + " elevado a " + y + " é igual a " + A);
        System.out.println(y + " elevado a 2" + " é igual a " + B);
        System.out.println(x + " elevado a -5 " + " é igual a " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
    }
}
