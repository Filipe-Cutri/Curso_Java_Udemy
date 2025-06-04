package JavaPOO.Heranca.entities;

public class SavingsAccount extends Account {

    private Double interestedRating;

    public SavingsAccount(Integer number, String holder, Double balance, Double interestedRating) {
        super(number, holder, balance);
        this.interestedRating = interestedRating;
    }

    public Double getInterestedRating() {
        return interestedRating;
    }

    public void setInterestedRating(Double interestedRating) {
        this.interestedRating = interestedRating;
    }

    public void updateBalance() {
        balance += balance + interestedRating;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
