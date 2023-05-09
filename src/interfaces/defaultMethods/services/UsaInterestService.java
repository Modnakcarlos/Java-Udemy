package interfaces.defaultMethods.services;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestServices {
    private Double interestRate;

    public UsaInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }


}
