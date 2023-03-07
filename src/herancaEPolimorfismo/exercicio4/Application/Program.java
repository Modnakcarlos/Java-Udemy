package herancaEPolimorfismo.exercicio4.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import herancaEPolimorfismo.exercicio4.entities.Company;
import herancaEPolimorfismo.exercicio4.entities.Individual;
import herancaEPolimorfismo.exercicio4.entities.TaxPayer;

public class Program {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data: ");

            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if(ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                sc.nextLine();

                list.add(new Company(name, anualIncome, numberEmployees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");

        
        double soma = 0;
        for(TaxPayer t : list) {
            
            System.out.println(t.getName() + ": R$ " + String.format("%.2f", t.taxPag()));
            soma += t.taxPag();
        }

        System.out.println("TOTAL TAXES: R$ " + soma);


        sc.close();
    }
}
