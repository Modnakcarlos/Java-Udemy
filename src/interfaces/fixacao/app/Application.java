package interfaces.fixacao.app;


import interfaces.fixacao.model.entities.Model;
import interfaces.fixacao.model.entities.RentCar;
import interfaces.fixacao.model.services.RentalServices;
import interfaces.fixacao.model.services.BrazilTaxServices;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel:");
        System.out.print("Modelo do carro: ");
        String modelCar = sc.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), sdf);

        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), sdf);

        System.out.print("Entre com preço por hora: ");
        double pricePerHour = sc.nextDouble();

        System.out.print("Entre com preço por dia: ");
        double pricePerday = sc.nextDouble();

        RentalServices valores = new RentalServices(pricePerHour, pricePerday, new BrazilTaxServices());
        RentCar duration = new RentCar(start, finish, new Model(modelCar));

        valores.processInvoice(duration);

        System.out.println("FATURA:");
        System.out.println("Pagamento básico: " + String.format("%.2f", duration.getInvoice().getBasicPayment()));
        System.out.println("Imposto: " + String.format("%.2f", duration.getInvoice().getTax()));
        System.out.println("Pagamento total: " + String.format("%.2f",duration.getInvoice().getTotalPayment()));

    sc.close();

    }


}
