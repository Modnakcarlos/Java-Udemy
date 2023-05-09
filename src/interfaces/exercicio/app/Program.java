package interfaces.exercicio.app;

import interfaces.exercicio.model.contractService.ContractService;
import interfaces.exercicio.model.contractService.PaypalService;
import interfaces.exercicio.model.entities.Contract;
import interfaces.exercicio.model.entities.Installment;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.nextLine(), dtf);

        System.out.print("Valor do contrato: ");
        double valorContrato = sc.nextDouble();

        System.out.print("Entre com o número de parcelas: ");
        int parcelas = sc.nextInt();
        sc.nextLine();

        Contract contract = new Contract(numero, data, valorContrato);

        ContractService service = new ContractService(new PaypalService());
        service.processContract(contract, parcelas);

        System.out.println("Parcelas: ");

        for(Installment c : contract.getInstallments()) {
            System.out.println(c);
        }

        sc.close();
    }
}
