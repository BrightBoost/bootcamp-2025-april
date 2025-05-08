package week5;

import java.time.LocalDate;

public class Human {
    public static String latinSpeciesName = "Homo sapiens";
    public static int populationCount = 0;

    public static void displayHumanInfo() {
        System.out.println("Info about humans, there are " + populationCount + " of the " + latinSpeciesName);
    }

    private String name;
    private LocalDate dob;

    public Human(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
        populationCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
