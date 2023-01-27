package programacaoOrientadaAObjetos.membrosEstaticos.exemplo1.util;


public class Calculator {

    public static final double PI = 3.14159;

    public static double cinrcunferencia(double raio) {
        return 2 * PI * raio;
    }

    public static double volume(double raio) {
        return 4 * Math.pow(raio, 3) /3;
    }


}
