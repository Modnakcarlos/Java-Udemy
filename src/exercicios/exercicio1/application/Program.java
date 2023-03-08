package exercicios.exercicio1.application;
import java.util.Locale;
import java.util.Scanner;

import exercicios.exercicio1.model.entities.Account;
import exercicios.exercicio1.model.exceptions.DomainException;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter account data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();

        System.out.print("Holder: ");
        String holder = sc.nextLine();

        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        Double withDrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, balance, withDrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        Double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
            System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));
        }
        catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }

        sc.close();
    }
}
