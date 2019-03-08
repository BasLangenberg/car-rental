package nl.homecooked.nl.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClientTest {

    Client client;

    @BeforeEach
    void before() {
        client = new Client("Clint Eastwood");
    }

    @Test
    void Client_ClassExists(){
        assert client instanceof Client;
    }

    @Test
    void Client_HasName(){
        assert client.getName().equals("Clint Eastwood");
    }
}
