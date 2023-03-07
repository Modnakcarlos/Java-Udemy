package tratamentoDeErros.exemplo.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import tratamentoDeErros.exemplo.model.entities.Reservation;
import tratamentoDeErros.exemplo.model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

        
        try{
        System.out.print("Room number: ");
        int roomNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Checkin date (dd/MM/YYYY): ");
        Date checkIn = sdf.parse(sc.next());

        System.out.println("Checkin date (dd/MM/YYYY): ");
        Date checkOut = sdf.parse(sc.next());

        Reservation reserva = new Reservation(roomNumber, checkIn, checkOut);
        
        System.out.println(reserva);

        System.out.println("Enter data to update the reservation:");
        System.out.print("Checkin date (dd/MM/YYYY): ");
        checkIn = sdf.parse(sc.next());

        System.out.println("Checkin date (dd/MM/YYYY): ");
        checkOut = sdf.parse(sc.next());

        reserva.updateDate(checkIn, checkOut);

        System.out.println(reserva);
    
        }
        catch(ParseException e) {
           System.out.println("Invalid date format");
        }
        catch(DomainException e) {
            System.out.println("Error in reservation" + e.getMessage());
        }
        catch(RuntimeException e) {
            System.out.println("Unexpected error");
        }
        
        sc.close();
    }
}
