package herancaEPolimorfismo.teoria.exemplo.application;

import herancaEPolimorfismo.teoria.exemplo.entities.Account;
import herancaEPolimorfismo.teoria.exemplo.entities.BusinessAccount;
import herancaEPolimorfismo.teoria.exemplo.entities.SavingsRate;

public class Program {
    public static void main(String[] args) {
        
        //Account acc = new Account(1001, "Maria", 1200.0);
        //SavingsRate acc1 = new SavingsRate(1002, "Carlos", 0.0, 0.01);
        BusinessAccount acc2 = new BusinessAccount(1004, "Francisco", 300.0, 500);

        
        //UPCASTING
        //Account acc3 = new BusinessAccount(1002, "Carlos", 1340.0, 200.0);
        // uma conta Account recebeu uma variável da subclasse, pq uma subclasse é contida na super classe

        Account acc4 = new SavingsRate(1005, "Francisca", 100.0, 0.01);

        //DOWNCASTING
        BusinessAccount acc5 = (BusinessAccount) acc2;
        acc5.loan(100.0);

        //BusinessAccount acc6 = (BusinessAccount) acc; //
        //são duas contas de natureza diferente. pode usar o DOWNCASTING mas as classes tem que herdar uma superclasse
        // melhor usar instaceof

        if(acc4 instanceof BusinessAccount) {
            BusinessAccount acc7 = (BusinessAccount) acc4;
            acc7.loan(200.0);
            System.out.println("Loan!");
                //nao vai rodar, pq acc4 não é instancia de BusinessAccount
        }

        if(acc4 instanceof SavingsRate) {
            SavingsRate acc7 = (SavingsRate) acc4;
            acc7.updateBalance(200.0);

            System.out.println("Update!");
            //Agora vai dar certo porque as naturezas conversam.

        }

        
    }
}
