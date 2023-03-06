package herancaEPolimorfismo.teoria.exemplo.entities;

public class BusinessAccount extends Account{
        
    private double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public BusinessAccount(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        
        if(amount <= loanLimit) {
            balance += loanLimit - 10.0;
        }
        else {
            System.out.println("Seu limite de transferência é: " + loanLimit);
        }
    }

}

