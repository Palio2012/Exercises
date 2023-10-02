package entities;

public class Individual extends TaxPayer {

    private double healthExpenditures;

    public Individual() {
    }


    public Individual(String name, Double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (getAnualIncome() > 20000.00 ) {
            return getAnualIncome() * 0.25 - (getHealthExpenditures() * 0.5);
        }
        else {
            return getAnualIncome() * 0.15 - (getHealthExpenditures() * 0.5);
        }
    }

    public String toString () {
        return getName() +
                ": $ " +
                String.format("%.2f", tax());

    }

}
