package programacaoFuncionalEExpressoesLambda.fixacao.app;

import programacaoFuncionalEExpressoesLambda.fixacao.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ProgramEmployees {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String source = "C:\\GG\\int.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(source))) {

            List<Employee> list = new ArrayList<>();
            String fields = br.readLine();

            while(fields != null) {
                String[] oneItem = fields.split(",");
                //String[] twoAndThree = oneItem[1].split(",");
                list.add(new Employee(oneItem[0], oneItem[1], Double.parseDouble(oneItem[2])));
                fields = br.readLine();
            }



            System.out.print("Qual a média salarial para parâmetro: ");
            double mediaSalario = sc.nextDouble();


            List<String> email = list.stream()
                    .filter(p -> p.getSalary() > mediaSalario)
                    .map(Employee::getEmail)
                    .sorted((p1, p2) -> p1.toUpperCase().compareTo(p2.toUpperCase()))
                    .toList();

            System.out.println("Email de pessoas que o salário é maior que 2000.0: ");
            email.forEach(System.out::println);

            System.out.println("Soma do salário de pessoas cujo nome começa com 'M'");

            double soma = list.stream()
                    .filter(p -> p.getName().toUpperCase().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.printf("%.2f%n", soma);




        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
