package util;

public class CurrencyConverter {

    public double toReal (double dollarPrice, double dollarAmount) {
        return (dollarPrice * dollarAmount) * 0.06 + (dollarAmount * dollarPrice);
    }
}
