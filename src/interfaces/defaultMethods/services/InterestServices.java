package interfaces.defaultMethods.services;

import java.security.InvalidParameterException;

public interface InterestServices {
    public double getInterestRate();

    default double payment(double amount, int months) {
        if(months < 1) {
            throw new InvalidParameterException("Meses precisam ser maiores que 0 (zero)");
        }
        return amount * Math.pow(1 + getInterestRate() / 100, months);
    }
}
