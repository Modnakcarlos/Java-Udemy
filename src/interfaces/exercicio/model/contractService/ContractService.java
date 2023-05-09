package interfaces.exercicio.model.contractService;

import interfaces.exercicio.model.entities.Contract;
import interfaces.exercicio.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    OnlinePaymnentService onlinePaymnentService;
    public ContractService () {
    }

    public ContractService(OnlinePaymnentService onlinePaymnentService) {
        this.onlinePaymnentService = onlinePaymnentService;
    }

    public void processContract(Contract contract, Integer months) {

        double basicInstallment = contract.getTotalValue() / months;

        for(int i = 1; i <= months; i++) {
            LocalDate dateInstallment = contract.getDate().plusMonths(i);
            double interest = onlinePaymnentService.interest(basicInstallment, i);
            double feePayment = onlinePaymnentService.paymentFee(basicInstallment + interest);
            double finalMonthInstallment = basicInstallment + interest + feePayment;

            contract.getInstallments().add(new Installment(dateInstallment, finalMonthInstallment));
        }
    }
}
