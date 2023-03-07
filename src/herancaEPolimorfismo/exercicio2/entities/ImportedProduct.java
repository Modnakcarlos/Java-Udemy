package herancaEPolimorfismo.exercicio2.entities;

public final class ImportedProduct extends Product{
    
    private double customFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }

    public double totalPrice() {
        return price += customFee;
    }
    
    @Override
    public final String priceTag() {
        return name + " - R$ " + totalPrice() + "(Customs fee: R$ " + getCustomFee() + ")";
    }

}
