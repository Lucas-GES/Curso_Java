package src.services;

public class UsaInterestService implements InterestService{

    private double interesteRate;

    public UsaInterestService(double interesteRate) {
        this.interesteRate = interesteRate;
    }

    @Override
    public double getInterestRate(){
        return interesteRate;
    }

    public void setInteresteRate(double interesteRate) {
        this.interesteRate = interesteRate;
    }
}
