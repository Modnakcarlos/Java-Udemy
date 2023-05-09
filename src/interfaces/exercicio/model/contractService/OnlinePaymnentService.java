package interfaces.exercicio.model.contractService;

public interface OnlinePaymnentService {
    public Double paymentFee(Double amount);
    public Double interest(Double amount, Integer months);
}
