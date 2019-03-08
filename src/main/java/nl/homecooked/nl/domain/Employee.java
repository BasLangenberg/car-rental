package nl.homecooked.nl.domain;

public class Employee {
    private static String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
