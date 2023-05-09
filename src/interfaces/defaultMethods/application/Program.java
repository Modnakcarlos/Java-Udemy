package interfaces.defaultMethods.application;

import interfaces.defaultMethods.services.BrazilInterestService;
import interfaces.defaultMethods.services.InterestServices;
import interfaces.defaultMethods.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantia: ");
        double amount = sc.nextDouble();
        System.out.print("Meses: ");
        int months = sc.nextInt();

        InterestServices bis = new UsaInterestService(1.0);

        double payment = bis.payment(amount, months);

        System.out.println("Pagamento após " + months + " meses: ");
        System.out.printf("%.2f%n", payment);


        sc.close();
    }
}
