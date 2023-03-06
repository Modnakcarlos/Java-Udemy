package herancaEPolimorfismo.exercise.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import herancaEPolimorfismo.exercise.entities.Employee;
import herancaEPolimorfismo.exercise.entities.OutSourcedEmployee;

public class Program {
    public static void main(String []args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> emp = new ArrayList<>();
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1) + " data: ");
            
            System.out.println("Outsourced (y/n): ");
            char x = sc.next().charAt(0);
            sc.nextLine();
            
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours = sc.nextInt();
            sc.nextLine();

            System.out.print("Value per Hour: ");
            double valuePerHour = sc.nextDouble();

            if(x == 'y') {
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                emp.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
            else {
                emp.add(new Employee(name, hours, valuePerHour));
            }

        }

        System.out.println("PAYMENTS: ");
        for (Employee e : emp) {
            //lembrar de usar a variável "a" nas próximas linhas de codigo, e não o nome da lista;
			System.out.println(e.getName() + " - R$ " + String.format("%.2f", e.payment()));
		}







        sc.close();
    }
}
