package week7.interfaces.exercises;

public class Freelancer implements Payable{
    private double fixedPrice;

    public Freelancer(double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }

    public double getFixedPrice() {
        return fixedPrice;
    }

    public void setFixedPrice(double fixedPrice) {
        this.fixedPrice = fixedPrice;
    }


    @Override
    public double getPaymentAmount() {
        return fixedPrice;
    }
}
