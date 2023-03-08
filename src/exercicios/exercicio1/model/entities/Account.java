package exercicios.exercicio1.model.entities;

import exercicios.exercicio1.model.exceptions.DomainException;

public class Account {
    private Integer number;
    private final String holder;
    private Double balance;
    private final Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }


    public void withdraw(Double amount) throws DomainException {

         if(balance == 0) {
             throw new DomainException("Moneyless");
         }

         else if(withdrawLimit < amount) {
             throw new DomainException("the amount exceeds withdraw limit");
         }
         else if(balance < amount) {
             throw new DomainException("Not enough balance");
         }

        balance -= amount;
    }
}
