package interfaces.fixacao.model.services;

import interfaces.fixacao.model.entities.Invoices;
import interfaces.fixacao.model.entities.RentCar;
import interfaces.fixacao.model.services.TaxServices;

import java.time.Duration;

public class RentalServices {
    private double pricePerHour;
    private double PricePerDay;
    private TaxServices taxService;

    public RentalServices(double pricePerHour, double pricePerDay, TaxServices taxService) {
        super();
        this.pricePerHour = pricePerHour;
        this.PricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerDay() {
        return PricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        PricePerDay = pricePerDay;
    }

    public TaxServices getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxServices taxService) {
        this.taxService = taxService;
    }

    public void processInvoice(RentCar rentCar) {

        double minutes = Duration.between(rentCar.getStart(), rentCar.getFinish()).toMinutes();
        double hours = minutes / 60;
        double simplePayment;
        if(hours <= 12) {
            simplePayment = getPricePerHour() * Math.ceil(hours);
        }
        else {
            simplePayment = getPricePerDay() * Math.ceil(hours / 24);
        }
        double tax = taxService.tax(simplePayment);
        rentCar.setInvoice(new Invoices(simplePayment, tax));
    }
}
