package interfaces.fixacao.model.entities;

import java.time.LocalDateTime;

public class RentCar {

    private final LocalDateTime start;
    private final LocalDateTime finish;
    private Model model;

    private Invoices invoice;

    public RentCar(LocalDateTime start, LocalDateTime finish, Model model) {
        this.start = start;
        this.finish = finish;
        this.model = model;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public RentCar(LocalDateTime start, LocalDateTime finish, Invoices invoice) {
        this.start = start;
        this.finish = finish;
        this.invoice = invoice;
    }

    public Invoices getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoices invoice) {
        this.invoice = invoice;
    }
}


