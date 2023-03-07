package herancaEPolimorfismo.exercicio2.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public final class UsedProduct extends Product{
    
    private LocalDate manufacturaDate;

    public UsedProduct(Date manufacturaDate) {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufacturaDate) {
        super(name, price);
        this.manufacturaDate = manufacturaDate;
    }

    public LocalDate getManufacturaDate() {
        return manufacturaDate;
    }

    public void setManufacturaDate(LocalDate manufacturaDate) {
        this.manufacturaDate = manufacturaDate;
    }

    @Override
    public final String priceTag() {
        return getName() 
        + " (used) - R$ " 
        + String.format("%.2f", priceTag()) 
        + " (Manufacture date: " 
        + manufacturaDate.format(DateTimeFormatter.ofPattern("dd/MM/YYYY")) 
        + ")";
    }
}