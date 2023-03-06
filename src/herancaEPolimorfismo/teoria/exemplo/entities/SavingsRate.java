package herancaEPolimorfismo.teoria.exemplo.entities;

public class SavingsRate extends Account {
    
    private Double interestRate;

    public SavingsRate() {
        super();
    }

    public SavingsRate(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance (double balance) {
        balance += balance * interestRate;
    }

}
