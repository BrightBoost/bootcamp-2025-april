package week5.hotelslowly;

import java.time.LocalDateTime;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

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

    public double getRegularHours() {
        return hoursWorked <= 40 ? hoursWorked : 40;
    }

    /*
    ternary statement is used for short if / else statement that need to become a value
    so for example:
    double price = 0;
    if(blabla.equals("blabla") {
      price = 6;
    } else {
      price = 8;
    }

    can be written as >>>>>> double price = blabla.equals("blabla") ? 6 : 8;
     */
    public double getOvertimeHours() {
        return hoursWorked > 40 ? hoursWorked - 40 : 0; // condition ? value if true : value if false
    }

    public double getTotalPay() {
        return getPayRate() * getRegularHours() + getPayRate() * 1.5 * getOvertimeHours();
    }

    public void punchIn(double time) {
        startTime = time;
    }
    public void punchOut(double time) {
        hoursWorked += time - startTime;
    }

    public void punchIn() {
        int hours = LocalDateTime.now().getHour();
        int minutes = LocalDateTime.now().getMinute() * 1/60;
        startTime = hours + minutes;
    }

    public void punchOut() {
        int hours = LocalDateTime.now().getHour();
        double minutes = LocalDateTime.now().getMinute()/60.0;
        double endTime = hours + minutes;
        hoursWorked += endTime - startTime;
    }
}
