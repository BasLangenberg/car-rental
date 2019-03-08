package nl.homecooked.nl.domain;

public class Client {

    private final String name;

    public Client(String name) {
        this.name = name;
    }

    public Object getName() {
        return this.name;
    }
}
