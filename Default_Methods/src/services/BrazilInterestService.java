package src.services;

public class BrazilInterestService implements InterestService{

    private double interesteRate;

    public BrazilInterestService(double interesteRate) {
        this.interesteRate = interesteRate;
    }

    public void setInteresteRate(double interesteRate) {
        this.interesteRate = interesteRate;
    }

    @Override
    public double getInterestRate() {
        return interesteRate;
    }
}
