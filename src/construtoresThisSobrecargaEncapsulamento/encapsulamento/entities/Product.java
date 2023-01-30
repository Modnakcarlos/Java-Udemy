package construtoresThisSobrecargaEncapsulamento.encapsulamento.entities;

public class Product {
    
    private String name;
    private double price;
    private int quantity;

    public Product() {
        // construtor padrão 
    }
    
    public Product(String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    // public void setQuantity(int quantity) { não se costuma criar uma alteração de quantidade de estoque por exemplo, para protegeter o código, 
    //     this.quantity = quantity;             as alteraçãoes são feitas de outras maneiras
    //}
    
    public int getQuantity() {
        return quantity;
    }
    public double totalValueStock () {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
        
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", price ) + ", " + quantity + " units, TOTAL: $ " + String.format("%.2f", totalValueStock());
    }

}
