package week5.hotel;

import java.time.LocalDateTime;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    private double startTime;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return 0;
    }

    public double getRegularHours() {
        return 0;
    }

    public double getOvertimeHours() {
        return 0;
    }

    public void punchIn(double time) {
        this.startTime = time;
    }

    public void punchOut(double time) {
        double hoursWorkedToday = time - startTime;
        hoursWorked += hoursWorkedToday;
    }

    public void punchIn() {
        this.startTime = LocalDateTime.now().getHour();

        double minutes = LocalDateTime.now().getMinute();
        double roundedToDecimal = minutes / 0.6;
        this.startTime += roundedToDecimal;
    }

    public void punchOut() {
        double time = LocalDateTime.now().getHour();

        double minutes = LocalDateTime.now().getMinute();
        time += minutes / 60;
        double hoursWorkedToday = time - startTime;
        hoursWorked += hoursWorkedToday;
    }


}
