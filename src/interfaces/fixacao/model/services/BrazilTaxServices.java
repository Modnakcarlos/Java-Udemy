package interfaces.fixacao.model.services;

public class BrazilTaxServices implements TaxServices {

    @Override
    public Double tax(Double amount) {
        double tax;
        if(amount <= 100) {
            tax = amount * 0.2;
        }
        else {
            tax = amount * 0.15;
        }
        return tax;
    }
}
