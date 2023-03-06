package herancaEPolimorfismo.exemplo.entities;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance; // visível em subclasses (herança) sem ser visível a outras classes

    public Account() {
    }
    
    public Account(Integer number, String holder, Double balance) {
        super();
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public Double getBalance() {
        return balance;
    }
    
    public void withdraw(double amount) {
        balance -= amount + 5;
    }

    public void deposit(double amount) {
        balance += amount;
    } 


    
}
