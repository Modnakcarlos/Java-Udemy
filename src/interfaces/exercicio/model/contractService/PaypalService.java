package interfaces.exercicio.model.contractService;

public class PaypalService implements OnlinePaymnentService {

    private static final double feePercentage = 0.02;
    private static final double monthlyInterest = 0.01;
    @Override
    public Double paymentFee(Double amount) {
        return amount * feePercentage;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return amount * monthlyInterest * months;
    }
}
