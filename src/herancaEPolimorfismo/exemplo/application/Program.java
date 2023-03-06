package herancaEPolimorfismo.exemplo.application;

import herancaEPolimorfismo.exemplo.entities.Account;
import herancaEPolimorfismo.exemplo.entities.BusinessAccount;
import herancaEPolimorfismo.exemplo.entities.SavingsRate;

public class Program {

    public static void main(String [] args) {
        

    Account account = new Account(1001, "Alex", 1000.0);
    account.withdraw(200.0);
    System.out.println(account.getBalance());


    Account account2 = new SavingsRate(1002, "Carlos", 1000.0, 0.01);
    account2.withdraw(200.0);
    System.out.println(account2.getBalance()); // Aqui vai prevalecer o método da classe SavingRate e não da superclasse(Account)

    Account account3 = new BusinessAccount(1003, "José Almeida", 1000.0, 500.0);
    account3.withdraw(200.0);
    System.out.println(account3.getBalance());

    }
}