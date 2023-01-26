package exercicios.resolvendoProblemasemOrientacao.triangle;
public class Triangle {
    
    public double a;
    public double b;
    public double c;

    public double area() {
        double semiPerimetro = (a + b + c) / 2;
        return Math.sqrt((semiPerimetro * (semiPerimetro- a) * (semiPerimetro - b) + (semiPerimetro - c)));
    }
}


   