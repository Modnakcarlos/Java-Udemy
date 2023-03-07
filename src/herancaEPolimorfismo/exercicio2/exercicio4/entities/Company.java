package herancaEPolimorfismo.exercicio2.exercicio4.entities;

public class Company extends TaxPayer{
    
    private Integer numberEmployess;

    
    
    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, Integer numberEmployess) {
        super(name, anualIncome);
        this.numberEmployess = numberEmployess;
    }

    public Integer getNumberEmployess() {
        return numberEmployess;
    }

    public void setNumberEmployess(Integer numberEmployess) {
        this.numberEmployess = numberEmployess;
    }

    @Override
    public Double taxPag() {
      
        if(numberEmployess <= 10) {
            return getAnualIncome() * 0.16;
        }
        else {
            return getAnualIncome() * 0.14;
        }
    }



    

}
