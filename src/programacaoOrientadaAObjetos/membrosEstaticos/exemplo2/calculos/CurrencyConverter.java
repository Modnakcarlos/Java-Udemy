package programacaoOrientadaAObjetos.membrosEstaticos.exemplo2.calculos;

public class CurrencyConverter {
    
    public static double valorFinal(double valor, double quantidade) {
        return valor * quantidade + (0.06 * valor);
    }
}