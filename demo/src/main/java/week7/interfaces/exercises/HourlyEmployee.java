package week7.interfaces.exercises;

public class HourlyEmployee implements Payable {
    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPaymentAmount() {
        return hourlyRate * hoursWorked;
    }
}
